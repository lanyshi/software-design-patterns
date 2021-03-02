package adapter;

/**
 * HTTPS connection that accesses customer data from external server.
 */
public class HTTPSConnection implements CustomerDataOverHTTPS {

    @Override
    public void printCustomer(CustomerID id) {
        System.out.println("Customer ID: " + id.print());
    }

    @Override
    public void getCustomer_withHTTPSConnect(CustomerID id) {
        System.out.println("Retrieving Customer " + id.print() + " via HTTPS connection...");
    }

    @Override
    public String getID(CustomerID id) {
        return id.print();
    }
}
