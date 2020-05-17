package devices;

public abstract class Device {
    final String model;
    final String producer;
    final int yearOfProduction;

    public Device(String producer, String model, int yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
    }

    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device: " + getClass().getName() + "\nModel: " + model + "\nProducer: " + producer +"\nYear of production: " + yearOfProduction;
    }
}
