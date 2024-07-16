public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car1", 1);
        Car car2 = new Car("Car2", 2);

        Truck truck1 = new Truck("Truck1", 6);
        Truck truck2 = new Truck("Truck2", 8);

        Bicycle bicycle1 = new Bicycle("Bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("Bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(car2);
        station.check(truck1);
        station.check(truck2);
        station.check(bicycle1);
        station.check(bicycle2);
    }
}