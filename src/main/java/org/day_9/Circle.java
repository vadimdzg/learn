package org.day_9;

public class Circle extends Figure{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius,2);
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }
}
