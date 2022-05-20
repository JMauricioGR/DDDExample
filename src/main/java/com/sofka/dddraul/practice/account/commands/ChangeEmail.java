package com.sofka.dddraul.practice.account.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.account.values.Email;

public class ChangeEmail extends Command {

    private final Email email;

    public ChangeEmail(Email email){

        this.email = email;
    }

    public Email getEmail() {
        return email;
    }
}
