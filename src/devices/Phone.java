package devices;

import com.company.Application;
import com.company.Human;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public final class Phone extends Device {
    static final String SERVER_URL = "10.10.10.10";
    static final int PORT = 8080;
    static final String VERSION = "1.0.0";
    private List<Application> apps = new ArrayList<Application>();

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

    public void installApplication(Human buyer, Application app) throws Exception {
        if (app.getPrice() > buyer.cash) {
            throw new Exception("Nie masz tyle papieru ziom");
        }

        if (this.isApplicationInstalled(app)) {
            throw new Exception("Aplikacje jest już zainstalowana");
        }

        apps.add(app);
        buyer.cash -= app.getPrice();
        System.out.println("Zainstalowano pomyślnie " + app.getName());
    }

    public boolean isApplicationInstalled(Application app) {
        return this.apps.contains(app);
    }

    public boolean isApplicationInstalledByName(String appName) {
        for (Application app : this.apps) {
            if (app.getName().equals(appName)) return true;
        }
        return false;
    }

    public void printFreeApplications() {
        for (Application app : this.apps) {
            if (app.getPrice() == 0.0) System.out.println(app.toString());
        }
    }

    public Double getPriceOfApplications() {
        Double sum = 0.0;
        for (Application app : this.apps) {
            sum += app.getPrice();
        }
        return sum;
    }

    public void printApplicationsByName() {
        this.apps.sort(Comparator.comparing(Application::getName));
        System.out.println(this.apps);
    }

    public void printApplicationsByPriceDesc() {
        this.apps.sort(Comparator.comparing(Application::getPrice));
        System.out.println(this.apps);
    }
}
