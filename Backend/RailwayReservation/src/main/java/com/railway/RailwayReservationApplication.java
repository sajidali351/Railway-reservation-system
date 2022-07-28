package com.railway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/**
 * The Class RailwayReservationApplication.
 */
@SpringBootApplication
public class RailwayReservationApplication {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(RailwayReservationApplication.class, args);
	}
	
	/**
	 * Gets the rest template.
	 *
	 * @return the rest template
	 */
	@Bean
	public RestTemplate getRestTemplate()
	{
		return new RestTemplate();
	} 

}

