package com.sofka.dddraul.practice.account.values;

import co.com.sofka.domain.generic.Identity;
import com.sofka.dddraul.practice.person.values.PersonId;

public class AccountId extends Identity {

    public AccountId(){

    }

    private AccountId(String id){
        super(id);
    }

    public static AccountId of(String id){
        return new AccountId(id);
    }
}
