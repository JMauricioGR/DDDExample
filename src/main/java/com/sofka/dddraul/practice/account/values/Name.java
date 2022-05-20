package com.sofka.dddraul.practice.account.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private final String value;

    public Name(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Empty name isn't allowed");
        }

        if (this.value.length() <= 5){
            throw new IllegalArgumentException("Name must be more than 5 characteres");
        }

        if (this.value.length() >= 100){
            throw new IllegalArgumentException("Name must be less than 100 characteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(value, name.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
