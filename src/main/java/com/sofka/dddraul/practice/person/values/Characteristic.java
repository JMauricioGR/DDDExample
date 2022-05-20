package com.sofka.dddraul.practice.person.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Characteristic implements ValueObject<String> {
    private final String value;

    public Characteristic(String value){
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("Empty characteristic isn't permit");
        }
    }


    public String value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Characteristic that = (Characteristic) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
