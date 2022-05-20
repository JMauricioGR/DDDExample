package com.sofka.dddraul.practice.person.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.account.values.AccountId;
import com.sofka.dddraul.practice.person.values.PersonId;

public class AddAccount extends Command {
    protected final PersonId personId;
    protected final AccountId accountId;

    public AddAccount(PersonId personId, AccountId accountId) {
        this.personId = personId;
        this.accountId = accountId;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public AccountId getAccountId() {
        return accountId;
    }
}
