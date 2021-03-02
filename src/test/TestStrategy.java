import strategy.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestStrategy {
    public TestStrategy() {}

    @Test
    public void testBusinessEmail() {
        Customer customer = new BusinessCustomer();
        assertEquals("This is an email to a Business customer.", customer.receiveEmail());
    }

    @Test
    public void testReturningEmail() {
        Customer customer = new ReturningCustomer();
        assertEquals("This is an email to a Returning customer.", customer.receiveEmail());
    }

    @Test
    public void testFrequentEmail() {
        Customer customer = new FrequentCustomer();
        assertEquals("This is an email to a Frequent customer.", customer.receiveEmail());
    }

    @Test
    public void testNewEmail() {
        Customer customer = new NewCustomer();
        assertEquals("This is an email to a New customer.", customer.receiveEmail());
    }

    @Test
    public void testVIPEmail() {
        Customer customer = new VIPCustomer();
        assertEquals("This is an email to a VIP customer.", customer.receiveEmail());
    }

}
