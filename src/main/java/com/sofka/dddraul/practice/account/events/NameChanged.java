package com.sofka.dddraul.practice.account.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.account.values.Name;

public class NameChanged extends DomainEvent {
    private final Name name;

    public NameChanged(Name name) {
        super("sofka.account.namechanged");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
