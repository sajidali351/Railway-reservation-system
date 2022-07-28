package com.railway.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.railway.model.PaymentDetails;
import com.railway.service.PaymentServiceImpl;

/**
 * The Class PaymentController.
 */
@RestController
@CrossOrigin("http://localhost:4200")
@RequestMapping("/pay")
public class PaymentController {
	
	/** The Constant LOGGER. */
	private final static Logger LOGGER = LoggerFactory.getLogger(RegisterController.class);

	/** The payment service impl. */
	@Autowired
	PaymentServiceImpl paymentServiceImpl;

	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	@GetMapping("/all")
	public List<PaymentDetails> getAll() {
		LOGGER.info("Start - all");
		LOGGER.info("End - all");
		return paymentServiceImpl.getAll();
	}

	/**
	 * Adds the payment details.
	 *
	 * @param payment the payment
	 * @return the string
	 */
	@PostMapping("/add")
	public String addPaymentDetails(@Valid @RequestBody PaymentDetails payment) {
		LOGGER.info("Start - add");
		long pnrNo = payment.getPnrNo();
		paymentServiceImpl.proceedToPay(payment);
		paymentServiceImpl.updateUserPaymentDetails(payment.getPnrNo());
		String sentMsg = "Your payment is successful";
		LOGGER.info("End - add");
		return sentMsg;
	}

	/**
	 * Delete payment details.
	 *
	 * @param pnrNo the pnr no
	 * @return the string
	 */
	@RequestMapping(value = "/cancel/{pnrNo}", method = { RequestMethod.GET, RequestMethod.DELETE })
	public String deletePaymentDetails(@PathVariable long pnrNo) {
		LOGGER.info("Start - cancel");
		LOGGER.info("End - cancel");
		return paymentServiceImpl.deletePayment(pnrNo);
	}

}
