package com.sofka.dddraul.practice.person.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Description implements ValueObject<String> {
    private final String value;

    public Description(String value) {
        this.value = Objects.requireNonNull(value);
        if (this.value.isBlank()){
            throw new IllegalArgumentException("Empty description isn't allowed");
        }

        if (this.value.length() <= 5){
            throw new IllegalArgumentException("Description must be more than 5 characteres");
        }

        if (this.value.length() >= 100){
            throw new IllegalArgumentException("Description must be less than 100 characteres");
        }
    }

    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Description that = (Description) o;
        return Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
