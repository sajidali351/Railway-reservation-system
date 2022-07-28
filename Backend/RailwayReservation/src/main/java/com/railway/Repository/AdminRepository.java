package com.railway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.TrainDetails;


/**
 * The Interface AdminRepository.
 */
@Repository
public interface AdminRepository  extends JpaRepository<TrainDetails,Integer>	{

}
