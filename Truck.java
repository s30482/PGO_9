public class Truck extends Vehicle{

    public double milesDriven;
    public double fuelConsumed;
    public double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven, double fuelConsumed, double cargoWeight) {
        super(make, model, year);
        this.fuelConsumed = fuelConsumed;
        this.milesDriven = milesDriven;
        this.cargoWeight = cargoWeight;
    }

    @Override
    double calculateFuelEfficiency() {
        return milesDriven/(fuelConsumed+(cargoWeight*0.5));
    }
}
