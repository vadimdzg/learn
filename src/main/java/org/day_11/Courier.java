package org.day_11;

public class Courier implements Worker{
    int salary;
    boolean isPayed;

    public Courier(int salary, boolean isPayed) {
        this.salary = salary;
        this.isPayed = isPayed;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Courier{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {

    }

    @Override
    public void bonus() {

    }
}
