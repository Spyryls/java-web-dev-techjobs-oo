package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Location {
    private int id;
    private static int nextId = 1;
    private String value;

    public Location() {
        this.id = nextId;
        nextId++;
    }

    public Location(String value) {
        this();
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }

    // TODO: Add a constructor that takes a string as a parameter and assigns it to the 'value' field. The
    //  constructor should also call the empty constructor in order to initialize the 'id' field.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id == location.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
