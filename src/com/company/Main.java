package com.company;

import devices.Car;
import devices.Phone;

public class Main {

    public static void main(String[] args) {
        Animal bird = new Animal("bird");
        bird.takeForAWalk();
        bird.feed();
        bird.takeForAWalk();
        bird.takeForAWalk();
        bird.takeForAWalk();
        bird.takeForAWalk();
        bird.takeForAWalk();
        bird.takeForAWalk();
        bird.feed();

        Human marta = new Human();
        Car opel = new Car("Opel", "Astra", 2002, 8000.0, 1500.0);
        marta.setCar(opel);

        Car opel2 = new Car("Opel", "Astra", 2012, 18000.0, 1750.0);
        if(opel.equals(opel2)) {
            System.out.println("rowne!");
        }

        System.out.println(opel);
        System.out.println(opel2);

        Car audi = new Car("Audi", "A4", 2008, 40000.0, 1550.0);
        System.out.println(audi);

        Animal kot = new Animal("Kot");
        System.out.println(kot);

        Human pawel = new Human();
        System.out.println(pawel);

        Phone samsung = new Phone("Samsung", "S20", 2020);
        System.out.println(samsung);

        samsung.turnOn();
        audi.turnOn();

    }
}
