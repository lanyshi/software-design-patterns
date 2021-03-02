import template.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestTemplate {

    public TestTemplate() {}

    @Test
    public void testBusinessEmail() {
        BusinessEmail businessEmail = new BusinessEmail();
        assertEquals("business", businessEmail.getCustomerType());
    }

    @Test
    public void testFrequentEmail() {
        FrequentEmail frequentEmail = new FrequentEmail();
        assertEquals("frequent", frequentEmail.getCustomerType());
    }

    @Test
    public void testNewEmail() {
        NewEmail newEmail = new NewEmail();
        assertEquals("new", newEmail.getCustomerType());
    }

    @Test
    public void testReturningEmail() {
        ReturningEmail returningEmail = new ReturningEmail();
        assertEquals("returning", returningEmail.getCustomerType());
    }

    @Test
    public void testVIPEmail() {
        VIPEmail vipEmail = new VIPEmail();
        assertEquals("vip", vipEmail.getCustomerType());
    }

}
