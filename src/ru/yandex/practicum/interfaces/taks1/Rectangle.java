package ru.yandex.practicum.interfaces.taks1;

public class Rectangle extends Parallelogram {
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
