package org.day_6;

public class Motorbike {
    private String model;
    private String color;
    private int age;

    public Motorbike(String model, String color, int age) {
        this.model = model;
        this.color = color;
        this.age = age;
    }
    public void info(){
        System.out.println("It's bike");
    }

    @Override
    public String toString() {
        return "Motorbike{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

    public int yearDifference(int year){
        return Math.abs(year - this.age);
    }
    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
