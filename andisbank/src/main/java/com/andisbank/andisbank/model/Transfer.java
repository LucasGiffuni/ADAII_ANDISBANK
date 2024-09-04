package com.andisbank.andisbank.model;

import java.util.Date;

public class Transfer{
    int id;
    Date date;
    int transferUser;
    int benefitedUser;
    int amount;
    String currency;
}