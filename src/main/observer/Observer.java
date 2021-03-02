package observer;

/**
 * Observer in the observer pattern.
 * Observer = Driver
 */
public interface Observer {
    void getNotified(DeliveryRequest deliveryRequest);
}
