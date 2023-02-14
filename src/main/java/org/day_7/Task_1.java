package org.day_7;

public class Task_1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("aaa",2000,50,200);
        Airplane airplane2 = new Airplane("bbb",2000,30,100);
        Airplane.compareAirplanes(airplane1,airplane2);
    }
}
