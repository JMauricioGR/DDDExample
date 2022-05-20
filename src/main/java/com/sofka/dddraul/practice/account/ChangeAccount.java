package com.sofka.dddraul.practice.account;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.dddraul.practice.account.events.AccountCreated;
import com.sofka.dddraul.practice.account.events.EmailChanged;
import com.sofka.dddraul.practice.account.events.NameChanged;

public class ChangeAccount extends EventChange {
    public ChangeAccount(Account account) {
        apply((AccountCreated event) -> {
            account.name = event.getName();
            account.email = event.getEmail();
        });

        apply((EmailChanged event) ->{
            account.email = event.getEmail();
        });

        apply((NameChanged event) -> {
            account.name = event.getName();
        });
    }
}
