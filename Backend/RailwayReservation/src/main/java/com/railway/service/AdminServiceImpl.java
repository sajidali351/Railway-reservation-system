package com.railway.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.railway.Exception.ResourceNotFoundException;
import com.railway.Repository.AdminRepository;
import com.railway.model.TrainDetails;


/**
 * The Class AdminServiceImpl.
 */
@Service
public class AdminServiceImpl implements AdminService {
	
	/** The admin repository. */
	@Autowired
	private AdminRepository adminRepository;

	/* 
	 * @see com.railway.service.AdminService#getAllDetails()
	 */
	@Override
	public List<TrainDetails> getAllDetails() {
		List<TrainDetails> trainDetails = new ArrayList<TrainDetails>();
		adminRepository.findAll().forEach(trainDetailsadd -> trainDetails.add(trainDetailsadd));
		return trainDetails;
	}
	
	

	/* 
	 * @see com.railway.service.AdminService#getDetailsByTrainNo(int)
	 */
	@Override
	public TrainDetails getDetailsByTrainNo(int trainNo) {
		return adminRepository.findById(trainNo)
				.orElseThrow(() -> new ResourceNotFoundException("Train not found with number : " + trainNo));
	}

	/* 
	 * @see com.railway.service.AdminService#addTrainDetails(com.railway.model.TrainDetails)
	 */
	@Override
	public void addTrainDetails(TrainDetails trainDetails) {
		adminRepository.save(trainDetails);
	}

	/* 
	 * 
	 * @see com.railway.service.AdminService#updateTrainDetails(int, com.railway.model.TrainDetails)
	 */
	@Override
	public TrainDetails updateTrainDetails(int trainNo, TrainDetails trainDetails) {
		TrainDetails existingDetails = adminRepository.findById(trainNo)
				.orElseThrow(() -> new ResourceNotFoundException(
						"Cannot update the given train details, as train not found with number : " + trainNo));
		existingDetails.setTrainNo(trainDetails.getTrainNo());
		existingDetails.setTrainName(trainDetails.getTrainName());
		existingDetails.setSourceStation(trainDetails.getSourceStation());
		existingDetails.setDestinationStation(trainDetails.getDestinationStation());
		existingDetails.setArrivalTime(trainDetails.getArrivalTime());
		existingDetails.setDeptTime(trainDetails.getDeptTime());
		existingDetails.setDuration(trainDetails.getDuration());
		existingDetails.setNoOfSeats(trainDetails.getNoOfSeats());
		existingDetails.setFirstClassACFare(trainDetails.getFirstClassACFare());
		existingDetails.setTwoTierAcFare(trainDetails.getTwoTierAcFare());
		existingDetails.setThreeTierAcFare(trainDetails.getThreeTierAcFare());
		existingDetails.setSleeperFare(trainDetails.getSleeperFare());
		return adminRepository.save(existingDetails);
	}

	/* 
	 * @see com.railway.service.AdminService#deleteTrainDetails(int)
	 */
	@Override
	public ResponseEntity<TrainDetails> deleteTrainDetails(int trainNo) {
		TrainDetails existingDetails = adminRepository.findById(trainNo).orElseThrow(
				() -> new ResourceNotFoundException("Cannot delete as train not found with number : " + trainNo));
		adminRepository.delete(existingDetails);
		return ResponseEntity.ok().build();
	}
	

}
