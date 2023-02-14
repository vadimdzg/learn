package org.day_6;

public class Car {
    private String model;
    private String color;
    private int age;

    public String getModel() {
        return model;
    }

    public void info(){
        System.out.println("It's auto");
    }
    public int yearDifference(int year){
        return Math.abs(year - this.age);
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
