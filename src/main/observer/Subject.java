package observer;

/**
 * Subject in the observer patter.
 * Subject = Shop
 */
public interface Subject {
    void add(Observer o);
    void remove(Observer o);
    void sendRequest(Order order);
}
