public class Locker {
    private final String id;
    private final LockerSize size;
    private LockerStatus status;
    private Package currentPackage;
    private PickupCode pickupCode;

    public Locker(String id, LockerSize size) {
        this.id = id;
        this.size = size;
        this.status = LockerStatus.AVAILABLE;
    }

    public boolean isAvailable() {
        return status == LockerStatus.AVAILABLE;
    }

    public boolean assignPackage(Package pkg, PickupCode code) {
        if (!isAvailable()) return false;
        this.currentPackage = pkg;
        this.pickupCode = code;
        this.status = LockerStatus.OCCUPIED;
        return true;
    }

    public Package releasePackage(PickupCode code) {
        if (status != LockerStatus.OCCUPIED || !pickupCode.equals(code)) {
            return null;
        }
        Package pkg = currentPackage;
        this.currentPackage = null;
        this.pickupCode = null;
        this.status = LockerStatus.AVAILABLE;
        return pkg;
    }

    public PickupCode getPickupCode() { return pickupCode; }
    public LockerSize getSize() { return size; }
    public String getId() { return id; }
}
