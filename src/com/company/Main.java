package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

public class Main {

    public static void main(String[] args) {
        Animal bird = new FarmAnimal("bird");
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
        Car opel = new Disel("Opel", "Astra", 2002, 8000.0, 1500.0);
        marta.setCar(opel);

        Car opel2 = new Electric("Opel", "Astra", 2012, 18000.0, 1750.0);
        if(opel.equals(opel2)) {
            System.out.println("rowne!");
        }

        System.out.println(opel);
        System.out.println(opel2);

        Car audi = new LPG("Audi", "A4", 2008, 40000.0, 1550.0);
        System.out.println(audi);

        Animal kot = new Pet("Kot");
        System.out.println(kot);

        Human pawel = new Human();
        System.out.println(pawel);

        Phone samsung = new Phone("Samsung", "S20", 2020);
        System.out.println(samsung);

        samsung.turnOn();
        audi.turnOn();

        marta.setCar(audi);
        marta.cash = 200.0;
        pawel.cash = 200.0;

        System.out.println("Pieniadze Marty: " + marta.cash);
        System.out.println("Pieniadze Pawla: " + pawel.cash);
        audi.sell(marta, pawel, 90);
        System.out.println("Pieniadze Marty: " + marta.cash);
        System.out.println("Pieniadze Pawla: " + pawel.cash);
        audi.sell(marta, pawel, 90);
        audi.sell(pawel, marta, 900);

        kot.feed(20.5);
        kot.feed();
        bird.feed(20.5);
        bird.feed();
    }
}
