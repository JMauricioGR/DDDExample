package com.sofka.dddraul.practice.person.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.person.values.Description;
import com.sofka.dddraul.practice.person.values.FunctionId;
import com.sofka.dddraul.practice.person.values.PersonId;

public class UpdateFunctionDescription extends Command {
    private final PersonId  personId;
    private final FunctionId functionId;
    private final Description description;

    public UpdateFunctionDescription(PersonId personId, FunctionId functionId, Description description) {
        this.personId = personId;
        this.functionId = functionId;
        this.description = description;
    }

    public PersonId getPersonId() {
        return personId;
    }

    public FunctionId getFunctionId() {
        return functionId;
    }

    public Description getDescription() {
        return description;
    }
}
