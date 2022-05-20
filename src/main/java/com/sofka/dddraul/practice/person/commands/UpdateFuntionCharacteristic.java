package com.sofka.dddraul.practice.person.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.person.values.Characteristic;
import com.sofka.dddraul.practice.person.values.FunctionId;
import com.sofka.dddraul.practice.person.values.PersonId;

public class UpdateFuntionCharacteristic extends Command {
    private final PersonId personId;
    private final FunctionId functionId;
    private final Characteristic characteristic;

    public UpdateFuntionCharacteristic(PersonId personId, FunctionId functionId, Characteristic characteristic) {
        this.personId = personId ;
        this.functionId = functionId;
        this.characteristic = characteristic;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public FunctionId getFunctionId() {
        return functionId;
    }

    public Characteristic getCharacteristic() {
        return characteristic;
    }
}
