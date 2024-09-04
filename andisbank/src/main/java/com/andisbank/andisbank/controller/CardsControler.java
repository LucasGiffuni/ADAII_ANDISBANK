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

import com.andisbank.andisbank.model.exceptions.ApplicacionException;
import com.andisbank.andisbank.model.responses.CreateDebitCardResponse;
import com.andisbank.andisbank.model.responses.IncreaseLimitCardResponse;
import com.andisbank.andisbank.service.ICardService;

import com.andisbank.andisbank.model.Card;
import com.andisbank.andisbank.model.Transfer;

@Controller
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

    @PatchMapping("/increase/{id}")
    public ResponseEntity increaseCredit(
            @RequestBody Card increasedCard, @PathVariable("id") Integer id) {
                IncreaseLimitCardResponse response = cardService.increaseCard(id, increasedCard.max_credit);
        return ResponseEntity.ok("limit card updated");
    }

  
}