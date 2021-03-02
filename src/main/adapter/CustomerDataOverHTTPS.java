package adapter;

/**
 * Customer data that's stored on the API server and can be accessed over HTTPS connection.
 */
public interface CustomerDataOverHTTPS {

    void printCustomer(CustomerID id);

    void getCustomer_withHTTPSConnect(CustomerID id);

    String getID(CustomerID id); // <--- for test purpose

}
