package adapter;

/**
 * USB connection that accesses customer data from external disk.
 */
public class USBConnection implements CustomerData {

    @Override
    public void printCustomer(CustomerID id) {
        System.out.println("Customer ID: " + id.print());
    }

    @Override
    public void getCustomer(CustomerID id) {
        System.out.println("Retrieving Customer " + id.print() + " via USB connection...");
    }

    @Override
    public String getID(CustomerID id) {
        return id.print();
    }
}
