package com.company;

import devices.Car;

public final class Human {
    private Animal pet;
    private Car car;
    private Double salary = 0.0;

    public void setCar(Car car) {
        if(this.salary > car.value) {
            System.out.println("udało się kupić za gotówkę");
            this.car = car;
        } else if(this.salary > car.value/12) {
            System.out.println("udało się kupić na kredyt (no trudno) i przypisujemy samochód");
            this.car = car;
        } else {
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
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
}
