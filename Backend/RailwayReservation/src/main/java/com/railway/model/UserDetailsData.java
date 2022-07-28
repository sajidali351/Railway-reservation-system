package com.railway.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Transient;


/**
 * The Class UserDetailsData.
 */
@Entity
@Table(name = "booking_details")
public class UserDetailsData {
	
	/** The Constant SEQUENCE_NAME. */
	@Transient
	public static final String SEQUENCE_NAME = "users_sequence";

	/** The id. */
	@Id
	@NotNull
	private int id;

	/** The pnr no. */
	@NotNull
	private long pnrNo;

	/** The name. */
	@NotNull
	@Size(min = 3, message = "Name should be minimum of 3 characters")
	private String name;

	/** The age. */
	@NotNull
	@Max(value = 99, message = "Age cannot be more than 99")
	private int age;

	/** The sex. */
	@NotNull
	@Size(max = 6, message = "Either male,female or other ")
	private String sex;

	/** The address. */
	@NotNull
	@Size(max = 70, message = "Address cannot exceed 70 characters..!!")
	private String address;

	/** The train no. */
	@NotNull
	@Max(value = 99999, message = "Train number cannot exceed 5 digits")
	private int trainNo;

	/** The train name. */
	@NotNull
	@Size(min = 5, message = "Train name should be minimum of 5 characters")
	private String trainName;

	/** The source station. */
	@NotNull
	@Size(min = 2, message = "Start Station should be minimum of 2 characters")
	private String sourceStation;

	/** The destination station. */
	@NotNull
	@Size(min = 2, message = "Destination Station should be minimum of 2 characters")
	private String destinationStation;

	/** The class type. */
	@NotNull
	@Size(min = 2, message = "Class type should be minimum of 2 characters")
	private String classType;

	/** The adults. */
	private int adults;
	
	/** The children. */
	private int children;

	/** The payment. */
	@NotNull
	private String payment;

	/**
	 * Instantiates a new user details data.
	 */
	public UserDetailsData() {
		super();
	}

	/**
	 * Instantiates a new user details data.
	 *
	 * @param id the id
	 * @param pnrNo the pnr no
	 * @param name the name
	 * @param age the age
	 * @param sex the sex
	 * @param address the address
	 * @param trainNo the train no
	 * @param trainName the train name
	 * @param sourceStation the source station
	 * @param destinationStation the destination station
	 * @param classType the class type
	 * @param adults the adults
	 * @param children the children
	 * @param payment the payment
	 */
	public UserDetailsData(@NotNull int id, @NotNull long pnrNo,
			@NotNull @Size(min = 3, message = "Name should be minimum of 3 characters") String name,
			@NotNull @Max(value = 99, message = "Age cannot be more than 99") int age,
			@NotNull @Size(max = 6, message = "Either male,female or other ") String sex,
			@NotNull @Size(max = 70, message = "Address cannot exceed 70 characters..!!") String address,
			@NotNull @Max(value = 99999, message = "Train number cannot exceed 5 digits") int trainNo,
			@NotNull @Size(min = 5, message = "Train name should be minimum of 5 characters") String trainName,
			@NotNull @Size(min = 2, message = "Start Station should be minimum of 2 characters") String sourceStation,
			@NotNull @Size(min = 2, message = "Destination Station should be minimum of 2 characters") String destinationStation,
			@NotNull @Size(min = 2, message = "Class type should be minimum of 2 characters") String classType,
			int adults, int children, @NotNull String payment) {
		super();
		this.id = id;
		this.pnrNo = pnrNo;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.address = address;
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.sourceStation = sourceStation;
		this.sourceStation = destinationStation;
		this.classType = classType;
		this.adults = adults;
		this.children = children;
		this.payment = payment;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
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
	 */
	public void setPnrNo() { // 0 to 1
		long number = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		this.pnrNo = number;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the age.
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age.
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * Gets the sex.
	 *
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * Sets the sex.
	 *
	 * @param sex the new sex
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * Gets the address.
	 *
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * Sets the address.
	 *
	 * @param address the new address
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * Gets the train no.
	 *
	 * @return the train no
	 */
	public int getTrainNo() {
		return trainNo;
	}

	/**
	 * Sets the train no.
	 *
	 * @param trainNo the new train no
	 */
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
	}

	/**
	 * Gets the train name.
	 *
	 * @return the train name
	 */
	public String getTrainName() {
		return trainName;
	}

	/**
	 * Sets the train name.
	 *
	 * @param trainName the new train name
	 */
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	/**
	 * Gets the source station.
	 *
	 * @return the source station
	 */
	public String getSourceStation() {
		return sourceStation;
	}

	/**
	 * Sets the source station.
	 *
	 * @param sourceStation the new source station
	 */
	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	/**
	 * Gets the destination station.
	 *
	 * @return the destination station
	 */
	public String getDestinationStation() {
		return destinationStation;
	}

	/**
	 * Sets the destination station.
	 *
	 * @param destinationStation the new destination station
	 */
	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
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

	/**
	 * Gets the adults.
	 *
	 * @return the adults
	 */
	public int getAdults() {
		return adults;
	}

	/**
	 * Sets the adults.
	 *
	 * @param adults the new adults
	 */
	public void setAdults(int adults) {
		this.adults = adults;
	}

	/**
	 * Gets the children.
	 *
	 * @return the children
	 */
	public int getChildren() {
		return children;
	}

	/**
	 * Sets the children.
	 *
	 * @param children the new children
	 */
	public void setChildren(int children) {
		this.children = children;
	}

	/**
	 * Gets the payment.
	 *
	 * @return the payment
	 */
	public String getPayment() {
		return payment;
	}

	/**
	 * Sets the payment.
	 *
	 * @param payment the new payment
	 */
	public void setPayment(String payment) {
		this.payment = payment;
	}

	/**
	 * Gets the sequence name.
	 *
	 * @return the sequence name
	 */
	public static String getSequenceName() {
		return SEQUENCE_NAME;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserDetails [id=" + id + ", pnrNo=" + pnrNo + ", name=" + name + ", age=" + age + ", sex=" + sex
				+ ", address=" + address + ", trainNo=" + trainNo + ", trainName=" + trainName + ", startStation="
				+ sourceStation + ", destStation=" + destinationStation + ", classType=" + classType + ", adults="
				+ adults + ", children=" + children + ", payment=" + payment + "]";
	}

}