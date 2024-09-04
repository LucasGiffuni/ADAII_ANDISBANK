package com.andisbank.andisbank.model;

public class HasCard{
    int id;
    String idCard;
    int idPerson;

    public HasCard(String idCard, int idPerson) {
        this.idCard = idCard;
        this.idPerson = idPerson;   
    }
}