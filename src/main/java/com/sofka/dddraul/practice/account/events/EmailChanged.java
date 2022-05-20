package com.sofka.dddraul.practice.account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.account.values.Email;

public class EmailChanged extends DomainEvent {
    private final Email email;

    public EmailChanged(Email email) {
        super("sofka.account.emailchanged");

        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
