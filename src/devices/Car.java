package devices;

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
}

