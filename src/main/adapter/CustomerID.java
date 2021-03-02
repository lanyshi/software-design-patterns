package adapter;

/**
 * Can be initialized as an instance that stores customer data.
 */
public class CustomerID {
    private String id;

    public CustomerID(String id) {
        this.id = id;
    }

    // For test purpose, returns string
    public String print() {
        return this.id;
    }
}
