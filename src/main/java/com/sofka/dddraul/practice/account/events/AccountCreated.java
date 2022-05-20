package com.sofka.dddraul.practice.account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.account.values.Email;
import com.sofka.dddraul.practice.account.values.Name;

public class AccountCreated extends DomainEvent {
    private final Name name;
    private final Email email;

    public AccountCreated(Name name, Email email) {
        super("sofka.account.accountcreated");
        this.name = name;
        this.email = email;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
