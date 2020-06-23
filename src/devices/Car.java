package devices;

import com.company.Human;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device {
    private Double weight = 100.0;
    private List<Human> owners = new ArrayList<Human>();

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
        if (!seller.hasCar(this) || !this.isOwner(seller)) {
            throw new Exception("Sprzedający nie posiada tego auta lub nie jest jego właścicielem");
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
        addOwner(buyer);

        System.out.println("Sprzedano " + this.model + " za " + price);
    }

    public double getValue() {
        return this.value;
    }

    public Integer transactionCount() {
        return this.owners.size() - 1;
    }

    public Human getOwner(){
        return this.owners.get(owners.size() - 1);
    }

    public boolean isOwner(Human owner) {
        if (owners.size() == 0) return false;
        return owners.get(owners.size() - 1) == owner;
    }

    public boolean wasOwner(Human human) {
        for (int i = 0; i < this.owners.size() - 1; i++) {
            if (this.owners.get(i) == human) return true;
        }
        return false;
    }

    public boolean wasTransactionBetween(Human seller, Human buyer) {
        for (int i = 0; i < this.owners.size() - 1; i++) {
            if (this.owners.get(i) == seller && this.owners.get(i + 1) == buyer) return true;
        }
        return false;
    }

    public void addOwner(Human owner) throws Exception {
        if (!this.isOwner(owner)) {
            owners.add(owner);
        } else {
            throw new Exception("Jesteś aktualnym właścicielem auta!!");
        }
    }

    public abstract void refuel();
}

