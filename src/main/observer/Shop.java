package observer;

import java.util.ArrayList;

/**
 * Shop receives and processes an order, notifies drivers about delivery requests.
 */
public class Shop implements Subject {
    private String name;
    private DeliveryRequest deliveryRequest;
    private ArrayList<Observer> drivers = new ArrayList<>();

    /**
     * Constructor
     * @param name
     */
    public Shop(String name) {
        this.name = name;
    }

    /**
     * Encapsulation
     * Set name of this shop
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Get the name of this shop
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get all current drivers
     * @return
     */
    public ArrayList<Observer> getAllDrivers() {
        return this.drivers;
    }

    /**
     * Add driver
     * @param o
     */
    @Override
    public void add(Observer o) {
        drivers.add(o);
    }

    /**
     * Remove driver
     * @param o
     */
    @Override
    public void remove(Observer o) {
        drivers.remove(o);
    }

    /**
     * Send delivery request for a specific order to all drivers
     */
    @Override
    public void sendRequest(Order order) {
        for (Observer o: drivers) {
            o.getNotified(processOrder(order));
        }
    }

    /**
     * This is a helper method
     * It processes an order and returns a new delivery request
     * Not yet fully implemented
     * @param o
     * @return
     */
    private DeliveryRequest processOrder(Order o) {
        // more implementation here
        this.deliveryRequest = new DeliveryRequest();
        return this.deliveryRequest;
    }
}

