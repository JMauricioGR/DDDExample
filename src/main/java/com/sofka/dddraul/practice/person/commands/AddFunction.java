package com.sofka.dddraul.practice.person.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.person.values.Characteristic;
import com.sofka.dddraul.practice.person.values.Description;
import com.sofka.dddraul.practice.person.values.FunctionId;
import com.sofka.dddraul.practice.person.values.PersonId;

public class AddFunction extends Command {
    protected final PersonId personId;
    protected final FunctionId entityId;
    protected final Characteristic characteristic;
    protected final Description description;

    public AddFunction(PersonId personId, FunctionId entityId, Characteristic characteristic, Description description) {
        this.personId = personId;
        this.entityId = entityId;
        this.characteristic = characteristic;
        this.description = description;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public FunctionId getEntityId() {
        return entityId;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }

    public Description getDescription() {
        return description;
    }
}
