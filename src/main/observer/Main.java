package observer;

public class Main {
    public static void main(String[] args) {
        // The shop receives a new order
        Shop shop = new Shop("Pizzeria");
        Order newOrder = new Order();
        // Creating 5 driver instances
        for (int i = 1; i <= 5; i++) {
            new Driver("Driver #" + i, shop);
        }
        // The shop is notifying all drivers that there is a new delivery request
        shop.sendRequest(newOrder);
    }
}
