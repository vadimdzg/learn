package org.day_9;

public class Student extends Human{
    private String groupName;

    public String getGroupName() {
        return groupName;
    }

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }
    @Override
    public void printInfo(){
        System.out.println("Это студент с именем " + super.getName());
    }
}
