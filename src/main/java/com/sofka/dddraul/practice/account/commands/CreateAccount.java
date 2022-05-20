package com.sofka.dddraul.practice.account.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.account.values.AccountId;
import com.sofka.dddraul.practice.account.values.Email;
import com.sofka.dddraul.practice.account.values.Name;

public class CreateAccount extends Command {


    private final AccountId accountId;
    private final Name name;
    private final Email email;

    public CreateAccount(AccountId accountId, Name name, Email email){
        this.accountId = accountId;
        this.name = name;
        this.email = email;
    }

    public AccountId getAccountId() {
        return accountId;
    }

    public Name getName() {
        return name;
    }

    public Email getEmail() {
        return email;
    }
}
