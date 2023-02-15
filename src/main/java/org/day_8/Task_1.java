package org.day_8;

public class Task_1 {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String s = "";
        StringBuilder sb;
        for (int i = 0; i < 20001; i++) {
           s = s + i + " ";
        }
        sb = new StringBuilder(s);
        System.out.println(sb);
        long stopTime = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.:" + (stopTime - startTime));
    }

}
