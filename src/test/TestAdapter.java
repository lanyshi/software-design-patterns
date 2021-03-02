import adapter.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestAdapter {

    public TestAdapter() {}

    @Test
    public void testPrintID() {
        CustomerID id = new CustomerID("a123");
        assertEquals("a123", id.print());
    }

    @Test
    public void testUSB() {
        CustomerDataOverUSB customerData = new USBConnection();
        CustomerID id = new CustomerID("b456");
        assertEquals("b456", customerData.getID(id));
    }

    @Test
    public void testHTTPS() {
        CustomerDataOverHTTPS customerData = new HTTPSConnection();
        CustomerID id = new CustomerID("c789");
        assertEquals("c789", customerData.getID(id));
    }

    @Test
    public void testAdapter() {
        // USB accesses data from disk
        CustomerID id_1 = new CustomerID("a123");
        CustomerDataOverUSB customerData = new USBConnection();
        assertEquals("a123", customerData.getID(id_1));

        // HTTPS accesses data from the server
        CustomerID id_2 = new CustomerID("b456");
        CustomerDataOverHTTPS customerDataOverHTTPS = new HTTPSConnection();
        // customerDataOverHTTPS.getID(id_1); <------ cannot access disk yet
        assertEquals("b456", customerDataOverHTTPS.getID(id_2));

        // Can access data on external disk after applying adapter
        CustomerDataOverUSB afterAdapter = new USBToHTTPSAdapter(customerDataOverHTTPS);
        assertEquals("a123", afterAdapter.getID(id_1));
    }
}

