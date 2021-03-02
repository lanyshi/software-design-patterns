package adapter;

/**
 * An adapter that allows the connection between API server and external disk.
 * HTTPS connection being the adaptee.
 */
public class USBToHTTPSAdapter implements CustomerData {
    private CustomerDataOverHTTPS customerDataOverHTTPS;

    public USBToHTTPSAdapter(CustomerDataOverHTTPS customerDataOverHTTPS) {
        this.customerDataOverHTTPS = customerDataOverHTTPS;
    }

    @Override
    public void printCustomer(CustomerID id) {
        customerDataOverHTTPS.printCustomer(id);
    }

    @Override
    public void getCustomer(CustomerID id) {
        customerDataOverHTTPS.getCustomer_withHTTPSConnect(id);
    }

    @Override
    public String getID(CustomerID id) {
        return customerDataOverHTTPS.getID(id);
    }
}
