package com.tts.week9day2;

import com.tts.week9day2.model.Customer;
import com.tts.week9day2.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Week9day2Application {

	private static final Logger log = LoggerFactory.getLogger(Week9day2Application.class);  // this logs and adds to your stacktrace.

	public static void main(String[] args) {SpringApplication.run(Week9day2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository customerRepository) {
		return (args) -> {
			customerRepository.save(new Customer("Johnny", "Walker"));
			customerRepository.save(new Customer("Donny", "Johnson"));
			customerRepository.save(new Customer("Felix", "DonJohnson"));
			customerRepository.save(new Customer("Trelvyn", "Walley"));

			log.info("Customers added successfully to database");
		};
	}

}
