package devices;

public final class Phone extends Device {

    public Phone(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void turnOn() {
        System.out.println(this.model + " are running");
    }
}
