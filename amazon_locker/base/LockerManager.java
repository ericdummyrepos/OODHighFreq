import java.util.*;

public class LockerManager {
    private final List<LockerLocation> locations = new ArrayList<>();

    public void addLocation(LockerLocation location) {
        locations.add(location);
    }

    public PickupCode assignLocker(Package pkg) {
        for (LockerLocation location : locations) {
            Optional<Locker> available = location.getAvailableLocker(pkg.getSize());
            if (available.isPresent()) {
                PickupCode code = PickupCode.generate();
                available.get().assignPackage(pkg, code);
                return code;
            }
        }
        throw new RuntimeException("No available locker found.");
    }

    public Package pickupPackage(PickupCode code) {
        for (LockerLocation location : locations) {
            Optional<Locker> locker = location.findLockerByCode(code);
            if (locker.isPresent()) {
                return locker.get().releasePackage(code);
            }
        }
        throw new RuntimeException("Invalid pickup code.");
    }
}
