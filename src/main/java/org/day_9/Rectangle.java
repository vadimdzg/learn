package org.day_9;

public class Rectangle extends Figure{
    double height;
    double width;

    public Rectangle(String color, double height, double width) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double area() {
        return this.height * this.width;
    }

    @Override
    public double perimeter() {
        return (this.height + this.width) * 2;
    }
}
