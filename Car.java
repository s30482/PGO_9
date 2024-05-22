public class Car extends Vehicle {

    public double milesDriven;
    public double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven, double fuelConsumed) {
        super(make, model, year);
        this.fuelConsumed = fuelConsumed;
        this.milesDriven = milesDriven;
    }

    @Override
    double calculateFuelEfficiency() {
        return milesDriven/fuelConsumed;
    }
}
