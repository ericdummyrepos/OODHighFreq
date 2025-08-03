public class LockerSystem {
    private final LockerManager manager = new LockerManager();

    public void addLocation(LockerLocation location) {
        manager.addLocation(location);
    }

    public PickupCode deliverPackage(Courier courier, Package pkg) {
        return manager.assignLocker(pkg);
    }

    public Package pickUpPackage(Customer customer, PickupCode code) {
        return manager.pickupPackage(code);
    }
}
