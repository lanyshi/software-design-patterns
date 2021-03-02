package observer;

/**
 * Driver gets notified about delivery requests.
 */
public class Driver implements Observer {
    private String name;
    private Shop shop;
    private DeliveryRequest deliveryRequest;

    /**
     * Constructor
     * Driver without shop assigned
     */
    public Driver(String name) {
        this.name = name;
        this.deliveryRequest = null;
    }

    /**
     * Constructor
     * Driver with a shop assigned
     */
    public Driver(String name, Shop shop) {
        this.name = name;
        this.shop = shop;
        this.deliveryRequest = null;
        this.shop.add(this);
    }

    /**
     * Setters and getters (encapsulation)
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Shop getShop() {
        return shop;
    }

    /**
     * Driver gets notified by the shop about a delivery request
     */
    @Override
    public void getNotified(DeliveryRequest deliveryRequest) {
        this.deliveryRequest = deliveryRequest;
        // more implementation here
    }

    /**
     * Get this delivery request
     * @return
     */
    public DeliveryRequest getDeliveryRequest() {
        return this.deliveryRequest;
    }
}

