package com.sofka.dddraul.practice.person;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.account.values.AccountId;
import com.sofka.dddraul.practice.person.events.*;
import com.sofka.dddraul.practice.person.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Person extends AggregateEvent<PersonId> {
    protected Name name;
    protected Set<Function> functions;
    protected AccountId accountId;

    public Person(PersonId entityId, Name name) {
        super(entityId);
        appendChange(new PersonCreated(name)).apply();
    }

    private Person(PersonId personId){
        super(personId);
        subscribe(new ChangePerson(this));
    }

    public static Person from(PersonId personId, List<DomainEvent> events){
        var person = new Person(personId);
        events.forEach(person::applyEvent);
        return person;
    }

    public void addFuntion(FunctionId entityId, Characteristic characteristic, Description description){
        Objects.requireNonNull(entityId);
        Objects.requireNonNull(characteristic);
        Objects.requireNonNull(description);
        appendChange(new FunctionAdded(entityId,characteristic,description)).apply();

    }

    public void associateAccount(AccountId accountId){
        appendChange(new AccountAssociated(accountId)).apply();
    }

    public void changeName(Name name){
        appendChange(new NameChanged(name)).apply();
    }

    public void updateFuntionCharacteristic(FunctionId functionId, Characteristic characteristic){
        appendChange(new FuntionCharacteristicUpdated(functionId, characteristic)).apply();
    }

    public void updateFuntionDescription(FunctionId functionId, Description description){
        appendChange(new FuntionDescriptionUpdated(functionId, description)).apply();
    }

    protected Optional<Function> functionById(FunctionId functionId){
        return functions()
                .stream()
                .filter(function -> function.identity().equals(functionId))
                .findFirst();
    }


    public Name name() {
        return name;
    }

    public Set<Function> functions() {
        return functions;
    }

    public AccountId accountId() {
        return accountId;
    }

}
