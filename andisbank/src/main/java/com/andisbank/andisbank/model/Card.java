package com.andisbank.andisbank.model;

public class Card{
    String id;
    int type;
    public int max_credit;    

    public Card(String id, int type, int max_credit) {
        this.id = id;
        this.type = type;
        this.max_credit = max_credit;
    }

    
    
}