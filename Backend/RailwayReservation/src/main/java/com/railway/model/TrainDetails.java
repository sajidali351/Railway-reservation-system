package com.railway.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * The Class TrainDetails.
 */
@Entity
@Table(name = "train_details")
public class TrainDetails {
	
	/** The train no. */
	@Id
	@NotNull(message = "Train number cannot be null")
	@Max(value = 99999, message = "Train number cannot exceed 5 digits")
	private int trainNo;

	/** The train name. */
	@NotNull
	@Size(min = 5, message = "Train name should be minimum of 5 characters")
	private String trainName;

	/** The source station. */
	@NotNull
	@Size(min = 2, message = "Source Station should be minimum of 2 characters")
	private String sourceStation;

	/** The destination station. */
	@NotNull
	@Size(min = 2, message = "Destination Station should be minimum of 2 characters")
	private String destinationStation;

	/** The arrival time. */
	@NotNull
	private String arrivalTime;

	/** The dept time. */
	@NotNull
	@Size(max = 7, message = "Departure Time should be maximum of 7 characters")
	private String deptTime;
	
	/** The duration. */
	private String duration;
	
	/** The no of seats. */
	private int noOfSeats;

	/** The first class AC fare. */
	private int firstClassACFare;
	
	/** The two tier ac fare. */
	private int twoTierAcFare;
	
	/** The three tier ac fare. */
	private int threeTierAcFare;
	
	/** The sleeper fare. */
	private int sleeperFare;

	/**
	 * Instantiates a new train details.
	 */
	public TrainDetails() {
		super();
	}

	/**
	 * Instantiates a new train details.
	 *
	 * @param trainNo the train no
	 * @param trainName the train name
	 * @param sourceStation the source station
	 * @param destinationStation the destination station
	 * @param arrivalTime the arrival time
	 * @param deptTime the dept time
	 * @param duration the duration
	 * @param noOfSeats the no of seats
	 * @param firstClassACFare the first class AC fare
	 * @param twoTierAcFare the two tier ac fare
	 * @param threeTierAcFare the three tier ac fare
	 * @param sleeperFare the sleeper fare
	 */
	public TrainDetails(int trainNo, String trainName, String sourceStation, String destinationStation,
			String arrivalTime, String deptTime, String duration, int noOfSeats, int firstClassACFare,
			int twoTierAcFare, int threeTierAcFare, int sleeperFare) {
		super();
		this.trainNo = trainNo;
		this.trainName = trainName;
		this.sourceStation = sourceStation;
		this.destinationStation = destinationStation;
		this.arrivalTime = arrivalTime;
		this.deptTime = deptTime;
		this.duration = duration;
		this.noOfSeats = noOfSeats;
		this.firstClassACFare = firstClassACFare;
		this.twoTierAcFare = twoTierAcFare;
		this.threeTierAcFare = threeTierAcFare;
		this.sleeperFare = sleeperFare;
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
	 * Gets the arrival time.
	 *
	 * @return the arrival time
	 */
	public String getArrivalTime() {
		return arrivalTime;
	}

	/**
	 * Sets the arrival time.
	 *
	 * @param arrivalTime the new arrival time
	 */
	public void setArrivalTime(String arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	/**
	 * Gets the dept time.
	 *
	 * @return the dept time
	 */
	public String getDeptTime() {
		return deptTime;
	}

	/**
	 * Sets the dept time.
	 *
	 * @param deptTime the new dept time
	 */
	public void setDeptTime(String deptTime) {
		this.deptTime = deptTime;
	}

	/**
	 * Gets the duration.
	 *
	 * @return the duration
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * Sets the duration.
	 *
	 * @param duration the new duration
	 */
	public void setDuration(String duration) {
		this.duration = duration;
	}

	/**
	 * Gets the no of seats.
	 *
	 * @return the no of seats
	 */
	public int getNoOfSeats() {
		return noOfSeats;
	}

	/**
	 * Sets the no of seats.
	 *
	 * @param noOfSeats the new no of seats
	 */
	public void setNoOfSeats(int noOfSeats) {
		this.noOfSeats = noOfSeats;
	}

	/**
	 * Gets the first class AC fare.
	 *
	 * @return the first class AC fare
	 */
	public int getFirstClassACFare() {
		return firstClassACFare;
	}

	/**
	 * Sets the first class AC fare.
	 *
	 * @param firstClassACFare the new first class AC fare
	 */
	public void setFirstClassACFare(int firstClassACFare) {
		this.firstClassACFare = firstClassACFare;
	}

	/**
	 * Gets the two tier ac fare.
	 *
	 * @return the two tier ac fare
	 */
	public int getTwoTierAcFare() {
		return twoTierAcFare;
	}

	/**
	 * Sets the two tier ac fare.
	 *
	 * @param twoTierAcFare the new two tier ac fare
	 */
	public void setTwoTierAcFare(int twoTierAcFare) {
		this.twoTierAcFare = twoTierAcFare;
	}

	/**
	 * Gets the three tier ac fare.
	 *
	 * @return the three tier ac fare
	 */
	public int getThreeTierAcFare() {
		return threeTierAcFare;
	}

	/**
	 * Sets the three tier ac fare.
	 *
	 * @param threeTierAcFare the new three tier ac fare
	 */
	public void setThreeTierAcFare(int threeTierAcFare) {
		this.threeTierAcFare = threeTierAcFare;
	}

	/**
	 * Gets the sleeper fare.
	 *
	 * @return the sleeper fare
	 */
	public int getSleeperFare() {
		return sleeperFare;
	}

	/**
	 * Sets the sleeper fare.
	 *
	 * @param sleeperFare the new sleeper fare
	 */
	public void setSleeperFare(int sleeperFare) {
		this.sleeperFare = sleeperFare;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TrainDetails [trainNo=" + trainNo + ", trainName=" + trainName + ", sourceStation=" + sourceStation
				+ ", destinationStation=" + destinationStation + ", arrivalTime=" + arrivalTime + ", deptTime="
				+ deptTime + ", duration=" + duration + ", noOfSeats=" + noOfSeats + ", firstClassACFare="
				+ firstClassACFare + ", twoTierAcFare=" + twoTierAcFare + ", threeTierAcFare=" + threeTierAcFare
				+ ", sleeperFare=" + sleeperFare + "]";
	}

}
