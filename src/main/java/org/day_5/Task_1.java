package org.day_5;

public class Task_1 {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setModel("VAG");
        car1.setColor("black");
        car1.setAge(2022);

        System.out.println("Model: " + car1.getModel() + "\nColor: " + car1.getColor() + "\nAge: " + car1.getAge());
    }
}