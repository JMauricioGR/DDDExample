package com.sofka.dddraul.practice.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.person.values.Name;

public class PersonCreated extends DomainEvent {
    private final Name name;

    public PersonCreated(Name name) {
        super("sofk.person.createdperson");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
