package com.sofka.dddraul.practice.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.person.values.Description;
import com.sofka.dddraul.practice.person.values.FunctionId;

public class FuntionDescriptionUpdated extends DomainEvent {
    private final FunctionId functionId;
    private final Description description;

    public FuntionDescriptionUpdated(FunctionId functionId, Description description) {
        super("sofka.perosn.functiondescriptionupdated");
        this.functionId = functionId;
        this.description = description;
    }

    public FunctionId functionId() {
        return functionId;
    }

    public Description description() {
        return description;
    }
}

