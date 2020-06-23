package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.util.Arrays;
import java.util.Comparator;

public final class Human {
    private Animal pet;
    public Car[] cars;
    private Phone phone;
    private Double salary = 0.0;
    public Double cash;
    public int carLimit = 2;

    public Human() {
        this.cars = new Car[this.carLimit];
    }

    public Human(int carLimit) {
        this.carLimit = carLimit;
        this.cars = new Car[this.carLimit];
    }

    public void setCar(Car car, int carPosition) {
        if (carPosition < 0 || carPosition > this.carLimit)
        {
            System.out.println("Podano nieistniejące miejsce");
            return;
        }
        this.cars[carPosition] = car;
    }

    public double getAllCarsValue() {
        double totalValue = 0.0;
        for (Car car : this.cars)
        {
            if (car != null) {
                totalValue += car.getValue();
            }
        }
        return totalValue;
    }

    public void sortCarsByYear() {
        Arrays.sort(this.cars, Comparator.comparing(Car::getValue));
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Pensja nie moze byc mniejsza od zera!");
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Pamiętaj aby odebrać aneks do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu!");
        this.salary = salary;
    }

    public Car getCar(int carPosition) {
        if (carPosition < 0 || carPosition > this.carLimit)
        {
            System.out.println("Podano nieistniejące miejsce");
            return null;
        }
        return cars[carPosition];
    }

    public boolean hasCar(Car car) {
        for (Car parkedCar : this.cars) {
            if (parkedCar == car) {
                return true;
            }
        }
        return false;
    }

    public boolean hasFreeCarSlot() {
        for (Car car : this.cars) {
            if (car == null) {
                return true;
            }
        }
        return false;
    }

    public String toString(){
        return "Ten czlowiek zarabia tyle: "+this.salary;
    }

    public Animal getPet() {
        return pet;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void sell() {
        System.out.println("Nie wolno tego tutaj");
    }
}
