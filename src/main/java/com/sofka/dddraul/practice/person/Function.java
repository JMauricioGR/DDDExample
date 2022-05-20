package com.sofka.dddraul.practice.person;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddraul.practice.person.values.Characteristic;
import com.sofka.dddraul.practice.person.values.Description;
import com.sofka.dddraul.practice.person.values.FunctionId;

import java.util.Objects;

public class Function extends Entity<FunctionId> {

    private Characteristic characteristic;
    private Description description;

    public Function(FunctionId entityId, Characteristic characteristic, Description description) {
        super(entityId);
        this.characteristic = characteristic;
        this.description = description;
    }

    public void upddateCharacteristic(Characteristic characteristic){
        this.characteristic = Objects.requireNonNull(characteristic);
    }

    public void updateDescription(Description description){
        this.description = Objects.requireNonNull(description);
    }

    public Characteristic characteristic() {
        return characteristic;
    }

    public Description description() {
        return description;
    }
}
