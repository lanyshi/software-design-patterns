package strategy;

public class NewCustomer extends Customer {
    public NewCustomer() {
        email = new NewEmail();
    }
}
