package com.sofka.dddraul.practice.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.account.values.AccountId;

public class AccountAssociated extends DomainEvent {
    private final AccountId accountId;

    public AccountAssociated(AccountId accountId) {
        super("sofka.person.accountadded");
        this.accountId = accountId;
    }

    public AccountId accountId() {
        return accountId;
    }
}
