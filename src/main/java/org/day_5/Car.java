package org.day_5;

public class Car {
    private String model;
    private String color;
    private int age;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Car(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }

    public Car() {
    }
}
