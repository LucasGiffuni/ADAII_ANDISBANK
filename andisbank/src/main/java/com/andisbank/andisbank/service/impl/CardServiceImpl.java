package com.andisbank.andisbank.service.impl;

import com.andisbank.andisbank.model.responses.CommonResponse;
import com.andisbank.andisbank.model.responses.IncreaseLimitCardResponse;
import com.andisbank.andisbank.model.responses.CreateDebitCardResponse;
import com.andisbank.andisbank.service.ICardService;

import org.springframework.stereotype.Service;

import com.andisbank.andisbank.model.Card;
import com.andisbank.andisbank.model.HasCard;
import com.andisbank.andisbank.model.Transfer;
import java.util.ArrayList;
import java.util.List;

@Service
public class CardServiceImpl implements ICardService {


    List<Card> cards = new ArrayList<Card>();
    List<Transfer> transfer = new ArrayList<Transfer>();
    transfer.append({
        
    })

    @Override
    public void getCustomerCard(int customer_id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCustomerCard'");
    }
    
    @Override
    public CreateDebitCardResponse createDebitCard(String customer_id) {
        Card newCard = new Card("4213000100015002", 1, 20000);
        cards.add(newCard)
        HasCard hasCard = new HasCard("4213000100015002", Integer.parseInt(customer_id));
        CreateDebitCardResponse response = new CreateDebitCardResponse();
        CommonResponse comResponse = new CommonResponse(200, "OK");
        response.setCommonResponse(comResponse);
        return response;
    }
    
    @Override
    public IncreaseLimitCardResponse increaseCard(int customer_id, int newLimit) {
        IncreaseLimitCardResponse response = new IncreaseLimitCardResponse();
        Card newCard = new Card("4213000100015002", 1, 20000);
        newCard.max_credit = newLimit;
        CommonResponse comResponse = new CommonResponse(200, "OK");
        return response;
    }

    public CreateDebitCardResponse cancelActiveCard(int idUser, int idCard){
        CreateDebitCardResponse response = new CreateDebitCardResponse();
        Card newCard = new Card("4213000100015002", 1, 123);
        HasCard hasCard = new HasCard("4213000100015002", idUser);
        
        response.setCommonResponse(new CommonResponse(200, "OK"));
        
        return response;
    }

    
    
   
}
