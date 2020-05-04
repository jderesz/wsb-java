package com.company;

public final class Animal {
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
            System.out.println("Pet died!");
        }

        this.weight += 0.1;
    }

    public void takeForAWalk() {
        this.weight -= 0.1;

        if(this.weight <= 0) {
            System.out.println("Pet died!");
        }
    }


}
