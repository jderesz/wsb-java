package com.company;

public final class Human {
    private Animal pet;
    private Car car;
    private Double salary = 0.0;

    public void setCar(Car car) {
        this.car = car;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            System.out.println("Salary cannot be lower than zero!");
        }
        System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
        System.out.println("Pamiętaj aby odebrać aneks do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą o zmianie wypłaty i nie ma sensu ukrywać dochodu!");
        this.salary = salary;
    }
}
