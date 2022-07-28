package com.railway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.UserDetailsData;


/**
 * The Interface UserDetailsRepository.
 */
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetailsData, Integer> {

}
