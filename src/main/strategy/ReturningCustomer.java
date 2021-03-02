package strategy;

public class ReturningCustomer extends Customer {
    public ReturningCustomer() {
        email = new ReturningEmail();
    }
}
