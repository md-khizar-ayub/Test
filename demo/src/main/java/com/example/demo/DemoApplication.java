package com.example.demo;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	public static final Logger log = LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {
		
		log.info("Khizar Ayub");
		SpringApplication.run(DemoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		log.info("Khizar Ayub in CommandLineRunner Override method");
		
	}

}
