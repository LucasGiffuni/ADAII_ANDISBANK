package com.andisbank.andisbank.model.responses;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import com.andisbank.andisbank.model.Card;
public class Increase {

    private Card card;
    private CommonResponse commonResponse;
    
    public Card getCard() {
        return card;
    }
    public void setCard(Card card) {
        this.card = card;
    }
    public CommonResponse getCommonResponse() {
        return commonResponse;
    }
    public void setCommonResponse(CommonResponse commonResponse) {
        this.commonResponse = commonResponse;
    }


    
    

}
