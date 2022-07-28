package com.railway.railway;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.railway.Repository.AdminRepository;
import com.railway.Repository.UserPaymentRepository;
import com.railway.Repository.UserRepository;
import com.railway.Repository.UserSignUpRepository;
import com.railway.model.PaymentDetails;
import com.railway.model.TrainDetails;
import com.railway.model.UserSignUp;
import com.railway.service.AdminService;
import com.railway.service.PaymentService;
import com.railway.service.SignUpService;
import com.railway.service.UserService;


/**
 * The Class RailwayReservationApplicationTests.
 */
@SpringBootTest
class RailwayReservationApplicationTests {

	/**
	 * Context loads.
	 */
	@Test
	void contextLoads() {
	}
	
	/** The sign up service. */
	@Autowired
	private SignUpService signUpService;
	
	/** The user sign up repository. */
	@MockBean
	private UserSignUpRepository userSignUpRepository;

	/** The user service. */
	@Autowired
	private UserService userService;
	
	/** The user repository. */
	@MockBean
	private UserRepository userRepository;
	
	/** The admin service. */
	@Autowired
	private AdminService adminService;
	
	/** The admin repository. */
	@MockBean
	private AdminRepository adminRepository;
	
	/** The payment service. */
	@Autowired
	private PaymentService paymentService;
	
	/** The payment repository. */
	@MockBean
	private UserPaymentRepository paymentRepository;
	
	
	/**
	 * Adds the users test.
	 */
	@Test
	public void addUsersTest() {
		UserSignUp userDetails = new UserSignUp("Shuaib", "Ali", new java.util.Date(System.currentTimeMillis()), "Male", "9895675645l", "shuaib123", "12345");
		signUpService.addUser(userDetails);
		verify(userSignUpRepository, times(1)).save(userDetails);
	}

	/**
	 * Delete users test.
	 */
	@Test
	public void deleteUsersTest() {
		long rid = 102;
		signUpService.deleteUser((int) rid);
		verify(userSignUpRepository, times(1)).deleteById((int) rid);
	}

	/**
	 * Update users test.
	 */
	@Test
	public void updateUsersTest() {
		int id = 102;
		UserSignUp userDetails = new UserSignUp("Shuaib", "Ali", new java.util.Date(System.currentTimeMillis()), "Male", "9895675645l", "shuaib123", "54321");
		signUpService.updateUser(id, userDetails);
		verify(userSignUpRepository, times(1)).save(userDetails);
	}

	/**
	 * Gets the all trains test.
	 *
	 * @return the all trains test
	 */
	@Test
	public void getAllTrainsTest() {
		when(userRepository.findAll()).thenReturn(Stream.of(
				new TrainDetails(12640, "BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL", "21:05", "15:00",
						"6hr 5mins", 12, 323, 456, 433, 556),
				new TrainDetails(12640, "BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL", "21:05", "15:00",
						"6hr 5mins", 12, 344, 322, 544, 33))
				.collect(Collectors.toList()));
		assertEquals(2, userService.getAllDetails().size());
	}
	
	/**
	 * Adds the trains test.
	 */
	@Test
	public void addTrainsTest() {
		TrainDetails trainDetails = new TrainDetails(12640, "BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL",
				"21:05", "15:00", "6hr 5mins", 12, 323, 456, 433, 556);
		adminService.addTrainDetails(trainDetails);
		verify(adminRepository, times(1)).save(trainDetails);
	}

	/**
	 * Gets the all train test.
	 *
	 * @return the all train test
	 */
	@Test
	public void getAllTrainTest() {
		when(adminRepository.findAll()).thenReturn(Stream.of(
				new TrainDetails(12640, "BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL", "21:05", "15:00",
						"6hr 5mins", 12, 323, 456, 433, 556),
				new TrainDetails(12640, "BRINDAVAN EXPRESS", "KSRBENGALURU", "MGRCHENNAICTL", "21:05", "15:00",
						"6hr 5mins", 12, 344, 322, 544, 33))
				.collect(Collectors.toList()));
		assertEquals(2, adminService.getAllDetails().size());

	}
	
	/**
	 * Adds the payment test.
	 */
	@Test
	public void addPaymentTest() {
		UserSignUp userDetails = new UserSignUp("Shuaib", "Ali", new java.util.Date(System.currentTimeMillis()), "Male", "9895675645l", "shuaib123", "12345");
		signUpService.addUser(userDetails);
		verify(userSignUpRepository, times(1)).save(userDetails);
	}
	
	/**
	 * Delete booking test.
	 */
	@Test
	public void deleteBookingTest() {
		long rid = 102;
		signUpService.deleteUser((int) rid);
		verify(userSignUpRepository, times(1)).deleteById((int) rid);
	}
	
	
	
}
