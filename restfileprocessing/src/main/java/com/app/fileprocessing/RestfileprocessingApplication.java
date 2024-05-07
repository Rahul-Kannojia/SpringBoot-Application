package com.app.fileprocessing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestfileprocessingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfileprocessingApplication.class, args);
	}
	
	// We should ensure that we need to create this bean and expose it.
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
