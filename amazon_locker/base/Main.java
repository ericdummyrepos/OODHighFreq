public class Main {
    public static void main(String[] args) {
        LockerSystem system = new LockerSystem();

        // Create location and lockers
        LockerLocation loc = new LockerLocation("LOC1", "123 Main St");
        loc.addLocker(new Locker("L1", LockerSize.SMALL));
        loc.addLocker(new Locker("L2", LockerSize.MEDIUM));
        system.addLocation(loc);

        Courier courier = new Courier("C1", "FedEx Bob");
        Customer customer = new Customer("U1", "Alice");

        // Deliver a package
        Package pkg = new Package("TRACK123", LockerSize.SMALL);
        PickupCode code = system.deliverPackage(courier, pkg);
        System.out.println("Pickup Code: " + code.getCode());

        // Pick up the package
        Package pickedUp = system.pickUpPackage(customer, code);
        System.out.println("Package picked up: " + pickedUp.getTrackingId());
    }
}
