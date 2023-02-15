package org.day_9;

public class Task_1 {
    public static void main(String[] args) {
        Student student = new Student("Student","First");
        Teacher teacher = new Teacher("Teacher", "Math");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();
    }
}
