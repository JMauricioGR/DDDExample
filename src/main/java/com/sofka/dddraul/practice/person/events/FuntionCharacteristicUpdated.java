package com.sofka.dddraul.practice.person.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddraul.practice.person.values.Characteristic;
import com.sofka.dddraul.practice.person.values.FunctionId;

public class FuntionCharacteristicUpdated extends DomainEvent {
    private final FunctionId functionId;
    private final Characteristic characteristic;

    public FuntionCharacteristicUpdated(FunctionId functionId, Characteristic characteristic) {
        super("sofka.person.functioncharacteristicupdated");
        this.functionId = functionId;
        this.characteristic = characteristic;
    }

    public FunctionId functionId() {
        return functionId;
    }

    public Characteristic characteristic() {
        return characteristic;
    }
}
