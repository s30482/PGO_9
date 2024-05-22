// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Vehicle Car1 = new Car("BMW", "M3", 2014,500, 345);
        System.out.println("Efektywność paliwowa samochoda: "+ Car1.calculateFuelEfficiency());
        Vehicle Truck1 = new Truck("Mercedes", "Benz", 1999, 1300, 500, 700);
        System.out.println("Efektywność paliwowa ciezarowki: "+ Truck1.calculateFuelEfficiency());
    }
}