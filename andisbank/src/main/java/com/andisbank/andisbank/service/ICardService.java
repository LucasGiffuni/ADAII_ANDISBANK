package com.andisbank.andisbank.service;

import com.andisbank.andisbank.model.HasCard;
import com.andisbank.andisbank.model.responses.CreateDebitCardResponse;
import com.andisbank.andisbank.model.responses.IncreaseLimitCardResponse;
import java.util.List;

public interface ICardService {
    

    public List<HasCard> getAllCards();

    public List<String> getCustomerCard(int customer_id);

    public CreateDebitCardResponse createDebitCard(String customer_id);

    public IncreaseLimitCardResponse increaseCard(int customer_id, String cardId, int newLimit);

    public HasCard cancelActiveCard(int idUser, String idCard);

}
