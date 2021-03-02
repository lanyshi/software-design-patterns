package strategy;

public class Main {
    public static void main(String[] args) {
        Customer business = new BusinessCustomer();
        System.out.println(business.receiveEmail());
        Customer returning = new ReturningCustomer();
        System.out.println(returning.receiveEmail());
        Customer frequent = new FrequentCustomer();
        System.out.println(frequent.receiveEmail());
        Customer newCustomer = new NewCustomer();
        System.out.println(newCustomer.receiveEmail());
        Customer vip = new VIPCustomer();
        System.out.println(vip.receiveEmail());
    }
}
