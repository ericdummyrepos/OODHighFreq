public class Package {
    private final String trackingId;
    private final LockerSize size;

    public Package(String trackingId, LockerSize size) {
        this.trackingId = trackingId;
        this.size = size;
    }

    public String getTrackingId() { return trackingId; }
    public LockerSize getSize() { return size; }
}
