package com.railway.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.Exception.ResourceNotFoundException;
import com.railway.Repository.UserDetailsRepository;
import com.railway.Repository.UserPaymentRepository;
import com.railway.model.PaymentDetails;
import com.railway.model.UserDetailsData;

/**
 * The Class PaymentServiceImpl.
 */
@Service
public class PaymentServiceImpl implements PaymentService {
	
	/** The id. */
	int id;

	/** The user payment repository. */
	@Autowired
	UserPaymentRepository userPaymentRepository;

	/** The user repo. */
	@Autowired
	UserDetailsRepository userRepo;

	/* 
	 * @see com.railway.service.PaymentService#getAll()
	 */
	public List<PaymentDetails> getAll() {
		List<PaymentDetails> payDetails = userPaymentRepository.findAll();
		return payDetails;
	}

	/* 
	 * @see com.railway.service.PaymentService#proceedToPay(com.railway.model.PaymentDetails)
	 */
	public String proceedToPay(PaymentDetails payment) {
		long pnrNo = payment.getPnrNo();
		List<UserDetailsData> det = userRepo.findAll();
		for (UserDetailsData x : det) {
			if (x.getPnrNo() == pnrNo) {
				id = x.getId();
			}
		}
		userRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException(
				"Cannot proceed the payment request as booking is not done with PNR Number : " + pnrNo));
		userPaymentRepository.save(payment);
		
		return ("Your payment for PNR Number " + payment.getPnrNo() + " is Successful...!!!");
	}

	/*
	 * @see com.railway.service.PaymentService#deletePayment(long)
	 */
	@Override
	public String deletePayment(long pnrNo) {
		userPaymentRepository.deleteById(pnrNo);
		return "You payment for " + pnrNo + " will be credited to your account within 7 days..";
	}

	/**
	 *  To Update Payment Field In User Details After Successful Payment *.
	 *
	 * @param pnrNo the pnr no
	 */
	public void updateUserPaymentDetails(long pnrNo) {
		List<UserDetailsData> details = userRepo.findAll();
		for (UserDetailsData x : details) {
			if (x.getPnrNo() == pnrNo) {
				x.setPayment("Successful");
				userRepo.save(x);
			}
		}
	}

	

}
