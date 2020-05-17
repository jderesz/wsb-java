package devices;

import com.company.Human;

final public class Car extends Device {
    private Double weight = 100.0;
    public Double value = 100.0;

    public Car(String producer, String model, int yearOfProduction, double value, double weight) {
        super(producer, model, yearOfProduction);
        this.value = value;
        this.weight = weight;
    }

    @Override
    public void turnOn() {
        System.out.println(this.model + " are running");
    }

    public void sell(Human seller, Human buyer, double price) {
        if (seller.getCar() != this) {
            System.out.println("Sprzedający nie posiada auta");
            return;
        }
        if (buyer.cash < price) {
            System.out.println("Kupujący nie posiada wystarczającej ilości pieniędzy");
            return;
        }

        seller.setCar(null);
        buyer.setCar(this);
        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Sprzedano " + this.model + " za " + price);
    }
}

