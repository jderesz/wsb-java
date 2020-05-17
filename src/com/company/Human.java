package com.company;

import creatures.Animal;
import devices.Car;
import devices.Phone;

public final class Human {
    private Animal pet;
    private Car car;
    private Phone phone;
    private Double salary = 0.0;
    public Double cash;

    public void setCar(Car car) {
        this.car = car;
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

    public Car getCar() {
        return car;
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
