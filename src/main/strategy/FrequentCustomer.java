package strategy;

public class FrequentCustomer extends Customer {
    public FrequentCustomer() {
        email = new FrequentEmail();
    }
}
