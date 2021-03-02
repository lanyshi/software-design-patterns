package strategy;

public class VIPCustomer extends Customer {
    public VIPCustomer() {
        email = new VIPEmail();
    }
}
