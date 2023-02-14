package org.day_6;

import java.util.Random;

public class Teacher {
    private String name;
    private String object;

    public Teacher(String name, String object) {
        this.name = name;
        this.object = object;
    }
    public void evaluate(Student student){
        Random r  = new Random();
        int x = r.nextInt((5 - 2) + 1) + 2;
        String score;
        if(x == 2) {score = "неуд";}
        else if (x == 3) {score = "удовл";}
        else if (x == 4) {score = "хорошо";}
        else {score = "отлично";}
        System.out.println("Преподаватель " + this.name + "оценил студента с именем " + student.getName() + " по пердмету " + this.object
                + " на оценку " + score);
    }
}
