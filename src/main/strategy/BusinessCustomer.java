package strategy;

public class BusinessCustomer extends Customer {
    public BusinessCustomer() {
        email = new BusinessEmail();
    }
}
