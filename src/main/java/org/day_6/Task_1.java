package org.day_6;

public class Task_1 {
    public static void main(String[] args) {
     Motorbike motorbike = new Motorbike("BIKE","black",2010);
     motorbike.info();
        System.out.println(motorbike);
        System.out.println(motorbike.yearDifference(2015));
    }
}
