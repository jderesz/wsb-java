package com.company;

import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Pet;
import devices.*;

public class Main {

    public static void main(String[] args) throws Exception {
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
        marta.setCar(opel, 0);

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


        Application app1 = new Application("app1", "1.0", 100.0);
        Application app2 = new Application("app2", "1.4", 5.0);
        Application app3 = new Application("app3", "2.5", 3.36);
        Application app4 = new Application("app4", "3.3.3", 8.99);

        marta.cash = 1000.0;

        samsung.installApplication(marta, app1);
        samsung.installApplication(marta, app3);
        samsung.installApplication(marta, app4);

        System.out.println(samsung.getPriceOfApplications());
        samsung.printFreeApplications();
        samsung.printApplicationsByName();
        samsung.printApplicationsByPriceDesc();
        System.out.println(samsung.isApplicationInstalledByName("app2"));
        System.out.println(samsung.isApplicationInstalledByName("app3"));

        marta.setCar(audi, 0);
        marta.cash = 200.0;
        pawel.cash = 200.0;

        System.out.println("Pieniadze Marty: " + marta.cash);
        System.out.println("Pieniadze Pawla: " + pawel.cash);
        try {
            audi.sell(marta, pawel, 90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Pieniadze Marty: " + marta.cash);
        System.out.println("Pieniadze Pawla: " + pawel.cash);
        try {
            audi.sell(marta, pawel, 90);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            audi.sell(pawel, marta, 900);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        System.out.println(audi.isOwner(marta));
        System.out.println(audi.isOwner(pawel));
        System.out.println(audi.wasTransactionBetween(marta, pawel));
        System.out.println(audi.wasTransactionBetween(pawel, marta));
        System.out.println(audi.wasOwner(marta));
        System.out.println(audi.transactionCount());
        System.out.println(audi.getOwner());

        kot.feed(20.5);
        kot.feed();
        bird.feed(20.5);
        bird.feed();
    }
}
