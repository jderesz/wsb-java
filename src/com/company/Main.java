package com.company;

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
        Car opel = new Car("Opel", "Astra");
        marta.setCar(opel);
    }
}
