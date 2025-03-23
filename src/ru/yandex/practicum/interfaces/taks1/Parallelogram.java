package ru.yandex.practicum.interfaces.taks1;

public abstract class Parallelogram implements Figure {
    protected double sideA;
    protected double sideB;

    public Parallelogram(double a, double b) {
        this.sideA = a;
        this.sideB = b;
    }
}
