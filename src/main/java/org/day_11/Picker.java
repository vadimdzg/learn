package org.day_11;

public class Picker implements Worker {
    int salary;
    boolean isPayed;
    Warehouse w;

    public Picker(int salary, boolean isPayedw) {
        this.salary = salary;
        this.isPayed = isPayed;
        w = new Warehouse();
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayed=" + isPayed +
                '}';
    }

    @Override
    public void doWork() {
        this.salary += 80;
        w.countPickedOrders += 1;
    }

    @Override
    public void bonus() {
        if(w.countPickedOrders < 10000){
            System.out.println("ERROR");
        } else if (w.getCountPickedOrders() >= 10000 & !this.isPayed) {
            this.salary += 70000;
            this.isPayed = true;

        } else {
            System.out.println("ERROR_2");
        }

    }
}
