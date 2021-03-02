package template;

/**
 * Email to vip customers
 */
public class VIPEmail extends EmailTemplate {

    @Override
    public void setCustomerType() {
        System.out.println("This is an email to vip customers.");
    }

    @Override
    public String getCustomerType() {
        return "vip";
    }
}
