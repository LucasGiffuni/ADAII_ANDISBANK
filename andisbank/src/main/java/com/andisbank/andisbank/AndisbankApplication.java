package com.andisbank.andisbank;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.andisbank.andisbank.model.HasCard;
import com.andisbank.andisbank.service.ICardService;
import com.andisbank.andisbank.service.impl.CardServiceImpl;

@SpringBootApplication
public class AndisbankApplication {

	public static void main(String[] args) {				
		SpringApplication.run(AndisbankApplication.class, args);
	}

	 @Bean
    public CommandLineRunner run(ICardService cardService) {
        return args -> {
            cardService.getAllCards().add(new HasCard("1234567", 1));
            cardService.getAllCards().add(new HasCard("1111111", 2));
            cardService.getAllCards().add(new HasCard("7777777", 3));
        };
    }

}
