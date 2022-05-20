package com.sofka.dddraul.practice.person.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.person.values.Name;
import com.sofka.dddraul.practice.person.values.PersonId;

public class CreatePerson extends Command {
    protected final PersonId entityId;
    protected final Name name;

    public CreatePerson(PersonId entityId, Name name) {
        this.entityId = entityId;
        this.name = name;
    }

    public PersonId getEntityId() {
        return entityId;
    }

    public Name getName() {
        return name;
    }
}
