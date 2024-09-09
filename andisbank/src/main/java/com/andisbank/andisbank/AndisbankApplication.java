package com.andisbank.andisbank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.andisbank.andisbank.service.ICardService;

@SpringBootApplication
public class AndisbankApplication {

	public static void main(String[] args) {				
		SpringApplication.run(AndisbankApplication.class, args);
	}

	 @Bean
    public CommandLineRunner run(ICardService cardService) {
        return args -> {			
			cardService.createDebitCard("1");
			cardService.createDebitCard("2");
			cardService.createDebitCard("3");
        };
    }

}
