public class Main {
    public static void main(String[] args) {

        Transport[] transports = new Transport[]{
                new Car("car1", 4),
                new Car("car2", 4),
                new Car("Truck1", 6),
                new Car("Truck2", 8),
                new Car("Bicycle1", 2),
                new Car("Bicycle2", 2)
        };

        ServiceStation station = new ServiceStation();

    for (Transport transport : transports) {
        station.check(transport);
    }
    }
}