package devices;

import com.company.Human;

public final class Phone extends Device {

    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println(this.model + " are running");
    }

    public void sell(Human seller, Human buyer, double price) {
        if (seller.getPhone() != this) {
            System.out.println("Sprzedający nie posiada telefonu");
            return;
        }
        if (buyer.cash < price) {
            System.out.println("Kupujący nie posiada wystarczającej ilości pieniędzy");
            return;
        }

        seller.setPhone(null);
        buyer.setPhone(this);
        buyer.cash -= price;
        seller.cash += price;

        System.out.println("Sprzedano " + this.model + " za " + price);
    }
}
