package adapter;

/**
 * Customer data that's stored in binary files on external disk
 * and can only be accessed with USB connection.
 */
public interface CustomerData {

    void printCustomer(CustomerID id);

    void getCustomer(CustomerID id);

    String getID(CustomerID id); // <--- for test purpose

}
