package com.kpacheco.strings;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsAssigmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsAssigmentApplication.class, args);
	}
	
	@RequestMapping("/")
	public String helloClient() {
		return "Hello Client! Welcome to the Strings assigment";
	}
	
	@RequestMapping("/random")
	public String random() {
		return "Spring Boot is great! So easy to just respond with Strings";
	}

}
