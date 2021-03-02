package template;

public abstract class EmailTemplate {

    public abstract void setCustomerType();

    // for test purpose
    public abstract String getCustomerType();

    // template method
    public final void generateEmail() {
        setCustomerType();
    }
}
