package me.sit.clean.entity;

public enum Grade {
    A(4.0),
    B(3.0),
    C(2.0),
    D(1.0),
    F(0.0);

    private double value;

    Grade(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
