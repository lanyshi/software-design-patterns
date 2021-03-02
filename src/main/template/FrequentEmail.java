package template;

/**
 * Email to frequent customers
 */
public class FrequentEmail extends EmailTemplate {

    @Override
    public void setCustomerType() {
        System.out.println("This is an email to frequent customers.");
    }

    @Override
    public String getCustomerType() {
        return "frequent";
    }
}
