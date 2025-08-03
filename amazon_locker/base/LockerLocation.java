import java.util.*;

public class LockerLocation {
    private final String locationId;
    private final String address;
    private final List<Locker> lockers;

    public LockerLocation(String locationId, String address) {
        this.locationId = locationId;
        this.address = address;
        this.lockers = new ArrayList<>();
    }

    public void addLocker(Locker locker) {
        lockers.add(locker);
    }

    public Optional<Locker> getAvailableLocker(LockerSize size) {
        return lockers.stream()
                .filter(locker -> locker.isAvailable() && locker.getSize() == size)
                .findFirst();
    }

    public Optional<Locker> findLockerByCode(PickupCode code) {
        return lockers.stream()
                .filter(locker -> code.equals(locker.getPickupCode()))
                .findFirst();
    }
}
