package com.sofka.dddraul.practice.account;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.account.events.AccountCreated;
import com.sofka.dddraul.practice.account.events.EmailChanged;
import com.sofka.dddraul.practice.account.events.NameChanged;
import com.sofka.dddraul.practice.account.values.AccountId;
import com.sofka.dddraul.practice.account.values.Email;
import com.sofka.dddraul.practice.account.values.Name;

import javax.annotation.processing.SupportedSourceVersion;
import java.util.List;

public class Account extends AggregateEvent<AccountId> {
    protected Name name;
    protected Email email;

    public Account(AccountId accountId, Name name, Email email){
        super(accountId);
        appendChange(new AccountCreated(name, email)).apply();
    }

    public Account(AccountId entityId) {
        super(entityId);
        subscribe(new ChangeAccount(this));
    }

    public static Account from(AccountId accountId, List<DomainEvent> events){
        var account = new Account(accountId);
        events.forEach(account::applyEvent);
        return account;
    }

    public void ChangeEmail(Email email){
        appendChange(new EmailChanged(email)).apply();
    }

    public void ChangeName(Name name){
        appendChange(new NameChanged(name)).apply();
    }

    public Name name() {
        return name;
    }

    public Email email() {
        return email;
    }
}
