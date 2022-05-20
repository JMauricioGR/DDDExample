package com.sofka.dddraul.practice.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.person.values.Name;

public class NameChanged extends DomainEvent {
    private final Name name;

    public NameChanged(Name name) {
        super("sofka.person.namechanged");
        this.name = name;
    }

    public Name name() {
        return name;
    }
}
