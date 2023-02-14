package org.day_6;

public class Task_3 {
    public static void main(String[] args) {
        Student student = new Student("Mike");
        Teacher teacher = new Teacher("Sam","math");
        teacher.evaluate(student);
    }
}
