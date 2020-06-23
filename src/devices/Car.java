package devices;

import com.company.Human;

public abstract class Car extends Device {
    private Double weight = 100.0;

    public Car(String producer, String model, int yearOfProduction, double value, double weight) {
        super(producer, model, yearOfProduction);
        this.value = value;
        this.weight = weight;
    }

    @Override
    public void turnOn() {
        System.out.println(this.model + " are running");
    }

    public void sell(Human seller, Human buyer, double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Sprzedający nie posiada tego auta");
        }
        if (!buyer.hasFreeCarSlot()) {
            throw new Exception("Kupujący nie posiada wolnego miejsca w garażu");
        }
        if (buyer.cash < price) {
            throw new Exception("Kupujący nie posiada wystarczającej ilości pieniędzy");
        }

        for (int i = 0; i < seller.cars.length; i++) {
            if (seller.cars[i] == this) {
                seller.cars[i] = null;
                break;
            }
        }

        for (int i = 0; i < buyer.cars.length; i++) {
            if (buyer.cars[i] == null) {
                buyer.cars[i] = this;
                break;
            }
        }

        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Sprzedano " + this.model + " za " + price);
    }

    public double getValue() {
        return this.value;
    }

    public abstract void refuel();
}

