package devices;

final public class Car {
    final String model;
    final String producer;
    private Double weight = 100.0;
    public Double value = 100.0;

    public Car(String model, String producer) {
        this.model = model;
        this.producer = producer;
    }

    public String toString(){
        return this.model+" "+this.producer;
    }
}

