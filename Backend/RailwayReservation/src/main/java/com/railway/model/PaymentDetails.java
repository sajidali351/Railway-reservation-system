package com.railway.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * The Class PaymentDetails.
 */
@Entity
@Table(name = "payment")
public class PaymentDetails {
	
	/** The card no. */
	private String cardNo;
	
	/** The pnr no. */
	@Id
	private long pnrNo;
	
	/** The cvv. */
	private int cvv;
	
	/** The bank name. */
	private String bankName;
	
	/** The class type. */
	private String classType;

	/**
	 * Instantiates a new payment details.
	 */
	public PaymentDetails() {
		super();
	}
    
	/**
	 * Instantiates a new payment details.
	 *
	 * @param cardNo the card no
	 * @param pnrNo the pnr no
	 * @param cvv the cvv
	 * @param bankName the bank name
	 * @param classType the class type
	 */
	public PaymentDetails(String cardNo, long pnrNo, int cvv, String bankName, String classType) {
		super();
		this.cardNo = cardNo;
		this.pnrNo = pnrNo;
		this.cvv = cvv;
		this.bankName = bankName;
		this.classType = classType;
	}

	/**
	 * Gets the card no.
	 *
	 * @return the card no
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * Sets the card no.
	 *
	 * @param cardNo the new card no
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * Gets the pnr no.
	 *
	 * @return the pnr no
	 */
	public long getPnrNo() {
		return pnrNo;
	}

	/**
	 * Sets the pnr no.
	 *
	 * @param pnrNo the new pnr no
	 */
	public void setPnrNo(long pnrNo) {
		this.pnrNo = pnrNo;
	}

	/**
	 * Gets the cvv.
	 *
	 * @return the cvv
	 */
	public int getCvv() {
		return cvv;
	}

	/**
	 * Sets the cvv.
	 *
	 * @param cvv the new cvv
	 */
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	/**
	 * Gets the bank name.
	 *
	 * @return the bank name
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * Sets the bank name.
	 *
	 * @param bankName the new bank name
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * Gets the class type.
	 *
	 * @return the class type
	 */
	public String getClassType() {
		return classType;
	}

	/**
	 * Sets the class type.
	 *
	 * @param classType the new class type
	 */
	public void setClassType(String classType) {
		this.classType = classType;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentDetails [cardNo=" + cardNo + ", pnrNo=" + pnrNo + ", cvv=" + cvv + ", bankName=" + bankName
				+ ", classType=" + classType + "]";
	}
}
