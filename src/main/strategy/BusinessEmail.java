package strategy;

public class BusinessEmail implements Email {
    @Override
    public String toString() {
        return "This is an email to a Business customer.";
    }
}
