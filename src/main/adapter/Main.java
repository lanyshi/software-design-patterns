package adapter;

public class Main {

    public static void main(String[] args) {
        CustomerID id = new CustomerID("12345"); // new CustomerID object
        // USB accesses data from disk
        CustomerDataOverUSB binaryData = new USBConnection();
        binaryData.printCustomer(id);
        binaryData.getCustomer_withUSBConnect(id);
        // HTTPS connection <----adaptee
        CustomerDataOverHTTPS apiData = new HTTPSConnection();
        // Apply adapter to system
        // Now the new system can use HTTPS connection to access external disk
        CustomerDataOverUSB newSystem = new USBToHTTPSAdapter(apiData);
        newSystem.printCustomer(id);
        newSystem.getCustomer_withUSBConnect(id);
    }
}
