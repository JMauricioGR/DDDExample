package com.sofka.dddraul.practice.account.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddraul.practice.person.values.Name;

public class ChangeName extends Command {
    private final Name name;

    public ChangeName(Name name){

        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
