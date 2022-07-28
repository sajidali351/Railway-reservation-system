package com.railway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.TrainDetails;


/**
 * The Interface UserRepository.
 */
@Repository
public interface UserRepository extends JpaRepository<TrainDetails, Integer> {

}
