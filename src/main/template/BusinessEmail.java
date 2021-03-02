package template;

/**
 * Email to business customers
 */
public class BusinessEmail extends EmailTemplate {

    @Override
    public void setCustomerType() {
        System.out.println("This is an email to business customers.");
    }

    @Override
    public String getCustomerType() {
        return "business";
    }
}

