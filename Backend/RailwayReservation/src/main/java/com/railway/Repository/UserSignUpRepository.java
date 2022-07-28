package com.railway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.UserSignUp;


/**
 * The Interface UserSignUpRepository.
 */
@Repository
public interface UserSignUpRepository extends JpaRepository<UserSignUp, Integer> {

}
