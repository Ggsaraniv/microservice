package com.example.BILLINGS.cong;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class confurgation {
	  @Bean
	    public RestTemplate restTemplate() {
	        return new RestTemplate();
	    }
}
