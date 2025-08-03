public abstract class User {
    protected String id;
    protected String name;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Courier extends User {
    public Courier(String id, String name) {
        super(id, name);
    }
}

public class Customer extends User {
    public Customer(String id, String name) {
        super(id, name);
    }
}
