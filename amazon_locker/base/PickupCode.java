import java.util.UUID;

public class PickupCode {
    private final String code;

    private PickupCode(String code) {
        this.code = code;
    }

    public static PickupCode generate() {
        return new PickupCode(UUID.randomUUID().toString().substring(0, 8));
    }

    public String getCode() { return code; }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof PickupCode) {
            return code.equals(((PickupCode) obj).code);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
