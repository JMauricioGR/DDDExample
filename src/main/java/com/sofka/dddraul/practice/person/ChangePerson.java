package com.sofka.dddraul.practice.person;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.dddraul.practice.person.events.*;

import java.util.HashSet;

public class ChangePerson extends EventChange {
    public ChangePerson(Person person) {
        apply((PersonCreated event) ->{
            person.name = event.getName();
            person.functions = new HashSet<>();
        });

        apply((AccountAssociated event) ->{
            person.accountId = event.accountId();
        });

        apply((FuntionDescriptionUpdated event) ->{
            var function = person.functionById(event.functionId())
                    .orElseThrow(()-> new IllegalArgumentException("Person function doesn't found")
                    );
            function.updateDescription(event.description());
        });

        apply((FuntionCharacteristicUpdated event) -> {
            var function = person.functionById(event.functionId())
                    .orElseThrow(()-> new IllegalArgumentException("Perosn function doesn't found"));
            function.upddateCharacteristic(event.characteristic());
        });

        apply((FunctionAdded event) ->{
            var functions = person.functions.size();
            if(functions == 6){
                throw new IllegalArgumentException("You can´t add more than 5 functions");
            }
            person.functions.add(new Function(
                    event.functionId(),
                    event.characteristic(),
                    event.description()
            ));
        });

        apply((NameChanged event) -> {
           person.name = event.name();
        });

    }
}
