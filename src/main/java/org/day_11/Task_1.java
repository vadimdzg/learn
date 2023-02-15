package org.day_11;

public class Task_1 {
    public static void main(String[] args) {
        Picker picker = new Picker(80000, false);
        businessProcess(picker);
        System.out.println(picker.w.getCountPickedOrders());
        System.out.println(picker.isPayed());
        System.out.println(picker.getSalary());
    }

    static void businessProcess(Worker worker) {
        for (int i = 1; i < 10001; i++) {
            worker.doWork();

        }
        worker.bonus();

    }
}
