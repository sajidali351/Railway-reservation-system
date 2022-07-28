package com.railway.service;

import java.util.List;

import com.railway.model.PaymentDetails;

/**
 * The Interface PaymentService.
 */
public interface PaymentService 
{
	
	/**
	 * Gets the all.
	 *
	 * @return the all
	 */
	public List<PaymentDetails> getAll();
	
	/**
	 * Proceed to pay.
	 *
	 * @param payment the payment
	 * @return the string
	 */
	public String proceedToPay(PaymentDetails payment);
	
	/**
	 * Delete payment.
	 *
	 * @param pnrNo the pnr no
	 * @return the string
	 */
	public String deletePayment(long pnrNo);
}

