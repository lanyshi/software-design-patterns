package template;

public class Main {
    public static void main(String[] args) {
        // initializing email objects based on customer types
        EmailTemplate businessEmail = new BusinessEmail();
        EmailTemplate frequentEmail = new FrequentEmail();
        EmailTemplate newEmail = new NewEmail();
        EmailTemplate returningEmail = new ReturningEmail();
        EmailTemplate vipEmail = new VIPEmail();

        // calling the template method on each email object
        businessEmail.generateEmail();
        frequentEmail.generateEmail();
        newEmail.generateEmail();
        returningEmail.generateEmail();
        vipEmail.generateEmail();
    }
}
