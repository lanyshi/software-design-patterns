package template;

/**
 * Email to new customers
 */
public class NewEmail extends EmailTemplate {

    @Override
    public void setCustomerType() {
        System.out.println("This is an email to new customers.");
    }

    @Override
    public String getCustomerType() {
        return "new";
    }
}
