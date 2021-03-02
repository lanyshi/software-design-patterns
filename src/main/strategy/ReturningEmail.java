package strategy;

public class ReturningEmail implements Email {
    @Override
    public String toString() {
        return "This is an email to a Returning customer.";
    }
}
