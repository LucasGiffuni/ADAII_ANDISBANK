package com.andisbank.andisbank.service;

import com.andisbank.andisbank.model.responses.CreateDebitCardResponse;
import com.andisbank.andisbank.model.responses.IncreaseLimitCardResponse;

public interface ICardService {
    


    public void getCustomerCard(int customer_id);

    public CreateDebitCardResponse createDebitCard(String customer_id);

    public IncreaseLimitCardResponse increaseCard(int customer_id, int newLimit);

    public CreateDebitCardResponse cancelActiveCard(int idUser, int idCard);

}
