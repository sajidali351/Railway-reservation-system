package com.railway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.railway.model.PaymentDetails;


/**
 * The Interface UserPaymentRepository.
 */
@Repository
public interface UserPaymentRepository extends JpaRepository<PaymentDetails, Long> {

}
