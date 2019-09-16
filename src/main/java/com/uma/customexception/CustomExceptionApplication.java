package com.uma.customexception;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@SpringBootApplication
public class CustomExceptionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomExceptionApplication.class, args);
	}

	@GetMapping("/students")
	public ResponseEntity getStudentDetails() {
		return null;

	}

}
