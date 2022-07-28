package com.railway.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.railway.Exception.ResourceNotFoundException;
import com.railway.Repository.UserPaymentRepository;
import com.railway.Repository.UserRepository;
import com.railway.model.PaymentDetails;
import com.railway.model.TrainDetails;


/**
 * The Class UserServiceImpl.
 */
@Service
public class UserServiceImpl implements UserService {
	
	/** The user repository. */
	@Autowired
	private UserRepository userRepository;

	/** The user pay reposotory. */
	@Autowired
	private UserPaymentRepository userPayReposotory;

	/* 
	 * @see com.railway.service.UserService#getAllDetails()
	 */
	@Override
	public List<TrainDetails> getAllDetails() {
		List<TrainDetails> trainDetails = new ArrayList<TrainDetails>();
		userRepository.findAll().forEach(trainDetails1 -> trainDetails.add(trainDetails1));
		return trainDetails;
	}

	/*
	 * @see com.railway.service.UserService#pnrStatus(long)
	 */
	@Override
	public String pnrStatus(long pnrNo) {
		Random rand = new Random();
		List<String> status = new ArrayList<String>();
		status.add("Confirm");
		status.add("Waiting list");
		List<PaymentDetails> paymentList = (List<PaymentDetails>) userPayReposotory.findAll();
		for (PaymentDetails det : paymentList) {
			if (det.getPnrNo() == pnrNo) {
				return status.get(rand.nextInt(status.size()));
			}
		}
		return "Ticket is not booked with PNR Number " + pnrNo;
	}

	/* 
	 * @see com.railway.service.UserService#getDetailsByTrainNo(int)
	 */
	@Override
	public TrainDetails getDetailsByTrainNo(int trainNo) {
		return userRepository.findById(trainNo)
				.orElseThrow(() -> new ResourceNotFoundException("Train not found with number : " + trainNo));
	}

	/* 
	 * @see com.railway.service.UserService#getTrainDetailsByEndPoints(java.lang.String, java.lang.String)
	 */
	@Override
	public List<TrainDetails> getTrainDetailsByEndPoints(String sourceStation, String destinationStation) {
		List<TrainDetails> detList = (List<TrainDetails>) userRepository.findAll();
		List<TrainDetails> req = new ArrayList<TrainDetails>();
		for (TrainDetails tr : detList) {
			String stat = tr.getSourceStation();
			String dest = tr.getDestinationStation();
			if (stat.equals(sourceStation) && dest.equals(destinationStation)) {
				req.add(tr);
			}
		}
		return req;
	}

}
