package com.andisbank.andisbank.controller;

import java.net.http.HttpHeaders;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.andisbank.andisbank.model.exceptions.ApplicacionException;
import com.andisbank.andisbank.model.responses.CreateDebitCardResponse;
import com.andisbank.andisbank.model.responses.IncreaseLimitCardResponse;
import com.andisbank.andisbank.service.ICardService;
import java.util.List;
import com.andisbank.andisbank.model.Card;
import com.andisbank.andisbank.model.HasCard;
import com.andisbank.andisbank.model.Transfer;

@RestController
public class CardsControler {

    // solicitar alta de tarjeta --> Lucas y Javier

    // solicitar baja --> colo

    // solicitar aumento de credito --> Sofi

    // ver movimientos --> Adje

    // ver estados de cuenta ----> invocacion a servico cuentas

    @Autowired
    ICardService cardService;

    @PostMapping("/{customer_account}/createDebitCard")
    public ResponseEntity createDebitCard(
            @PathVariable(name = "customer_account", required = true) String customer_account)
            throws ApplicacionException {

        CreateDebitCardResponse response = cardService.createDebitCard(customer_account);
        
        return new ResponseEntity(
                response.getCard(), HttpStatus.OK);
    }

    @GetMapping("/getAllCardsUsers")
    public List<HasCard> getAll() {
        return cardService.getAllCards();
    }

    @GetMapping("/getCardsFromUser/{userId}")
    public List<String> getCardFromUser(
        @PathVariable(name = "userId", required = true) int userId) {

        return cardService.getCustomerCard(userId);
    }

    @PatchMapping("/increase/{id}")
    public IncreaseLimitCardResponse increaseCredit(
            @RequestBody Card increasedCard, @PathVariable("id") Integer id) {
                IncreaseLimitCardResponse response = cardService.increaseCard(id, increasedCard.getId() ,increasedCard.max_credit);
        return response;
    }

    @DeleteMapping("/deleteCardUser/{idUser}/{idCard}")
    public HasCard cancelActiveCard(@PathVariable("idUser") int idUser, @PathVariable("idCard")String idCard){
        return cardService.cancelActiveCard(idUser, idCard);}


  
}