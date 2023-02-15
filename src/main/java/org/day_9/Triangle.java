package org.day_9;

public class Triangle extends Figure{
    double a;
    double b;
    double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
