package com.railway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.UserDetails;


/**
 * The Interface BookingRepository.
 */
@Repository
public interface BookingRepository extends JpaRepository<UserDetails, Integer> {

}
