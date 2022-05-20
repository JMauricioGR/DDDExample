package com.sofka.dddraul.practice.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.person.values.Characteristic;
import com.sofka.dddraul.practice.person.values.Description;
import com.sofka.dddraul.practice.person.values.FunctionId;

public class FunctionAdded extends DomainEvent {
    private final FunctionId functionId;
    private final Characteristic characteristic;
    private final Description description;

    public FunctionAdded(FunctionId functionId, Characteristic characteristic, Description description) {
        super("sofka.person.functionadded");
        this.functionId = functionId;
        this.characteristic = characteristic;
        this.description = description;
    }

    public FunctionId functionId() {
        return functionId;
    }

    public Characteristic characteristic() {
        return characteristic;
    }

    public Description description() {
        return description;
    }
}
