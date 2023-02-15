package org.day_9;

public class Teacher extends Human{
    private String subjectName;

    public String getSubjectName() {
        return subjectName;
    }

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    @Override
    public void printInfo(){
        System.out.println("Это преподаватель с именем " + super.getName());
    }
}
