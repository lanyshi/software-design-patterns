import observer.*;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Some Unit tests for the Observer pattern - delivery notification system
 */
public class TestObserver {
    public TestObserver() { }

    @Test
    public void testShopName() {
        Shop shop = new Shop("Starbucks");
        assertEquals("Starbucks", shop.getName());
        shop.setName("Wendy's");
        assertEquals("Wendy's", shop.getName());
    }

    @Test
    public void testDriver() {
        Shop shop = new Shop("Starbucks");
        Driver driver = new Driver("Joe", shop);
        assertEquals("Joe", driver.getName());
        assertEquals("Starbucks", driver.getShop().getName());
    }

    @Test
    public void testShopDrivers() {
        Shop shop = new Shop("");
        Driver driver1 = new Driver("Driver1", shop);
        Driver driver2 = new Driver("Driver2", shop);
        Driver driver3 = new Driver("Driver3", shop);
        assertEquals(3, shop.getAllDrivers().size());
    }

    @Test
    public void testShopAddRemove() {
        Shop shop = new Shop("Chipotle");
        Driver driver = new Driver("Driver4");
        driver.setShop(shop);
        shop.add(driver);
        assertEquals(1, shop.getAllDrivers().size());
        assertEquals("Chipotle", driver.getShop().getName());
        shop.remove(driver);
        assertEquals(0, shop.getAllDrivers().size());
    }

    @Test
    public void testShopSendRequest() {
        Order order = new Order();
        Shop shop = new Shop("Chipotle");
        for (int i = 1; i <= 5; i++) {
            new Driver("Driver" + i, shop);
        }
        int requests = 0;
        for (int i = 0; i < shop.getAllDrivers().size(); i++) {
            Driver d = (Driver) shop.getAllDrivers().get(i);
            if (d.getDeliveryRequest() != null) {
                requests++;
            }
        }
        assertEquals(0, requests);

        shop.sendRequest(order);
        requests = 0;
        for (int i = 0; i < shop.getAllDrivers().size(); i++) {
            Driver d = (Driver) shop.getAllDrivers().get(i);
            if (d.getDeliveryRequest() != null) {
                requests++;
            }
        }
        assertEquals(5, requests);
    }
}

