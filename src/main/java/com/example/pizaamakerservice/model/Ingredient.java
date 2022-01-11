package com.example.pizaamakerservice.model;

import java.util.Objects;

public class Ingredient {
    private int id;
    private String number;
    private boolean editable;

    public Ingredient(int id, String number, boolean editable) {
        this.id = id;
        this.number = number;
        this.editable = editable;
    }

    public Ingredient() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return id == that.id && editable == that.editable && number.equals(that.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, editable);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", editable=" + editable +
                '}';
    }
}
