package org.day_6;

public class Task_2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing",2000,50,100);
        airplane.fillUp(500);
        airplane.info();
        airplane.setYear(2003);
        airplane.setLength(60);
        airplane.info();
        airplane.setYear(2008);
        airplane.setLength(80);
        airplane.info();
    }
}
