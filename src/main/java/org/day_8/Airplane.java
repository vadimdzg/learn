package org.day_8;

public class Airplane {
    String manufacturer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String manufacturer, int year, int length, int weight) {
        this.manufacturer = manufacturer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    @Override
    public String toString() {
        return
                "Изготовитель: " + manufacturer +
                ", год выпуска: " + year +
                ", длина: " + length +
                ", вес: " + weight +
                ", количество топлива в баке: " + fuel ;
    }

    public void info(){
        System.out.println("Изготовитель: " + this.manufacturer + ", год выпуска: " + this.year + ", длина: " + this.length + ", вес: " + this.weight + ", количество топлива в баке: " + this.fuel);
    }
    public int fillUp(int n){
        return this.fuel += n;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
