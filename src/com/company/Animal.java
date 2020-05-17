package com.company;

public final class Animal implements Salleable {
    final String specie;
    private Double weight = 1.0;

    public Animal(String specie) {
        this.specie = specie;

        switch (specie) {
            case "dog":
                this.weight = 7.0;
                break;
            case "cat":
                this.weight = 5.0;
                break;
            case "bird":
                this.weight = 0.5;
                break;
        }
    }

    public void feed() {
        if(this.weight <= 0) {
            System.out.println("Umarło mu się :(");
        }

        this.weight += 0.1;
    }

    public void takeForAWalk() {
        this.weight -= 0.1;

        if(this.weight <= 0) {
            System.out.println("Umarło mu się :(");
        }
    }

    public String toString(){
        return this.specie;
    }

    public void sell(Human seller, Human buyer, double price) {
        if (seller.getPet() != this) {
            System.out.println("Sprzedający nie posiada zwierzaka");
            return;
        }
        if (buyer.cash < price) {
            System.out.println("Kupujący nie posiada wystarczającej ilości pieniędzy");
            return;
        }

        seller.setPet(null);
        buyer.setPet(this);
        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Sprzedano " + this.specie + " za " + price);
    }
}
