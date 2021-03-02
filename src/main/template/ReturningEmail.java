package template;

/**
 * Email to returning customers
 */
public class ReturningEmail extends EmailTemplate {

    @Override
    public void setCustomerType() {
        System.out.println("This is an email to returning customers.");
    }

    @Override
    public String getCustomerType() {
        return "returning";
    }
}
