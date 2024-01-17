package day_3_inheritance;

public class CustomerManager {

    public void add(Customer customer) {
        System.out.println(customer.getCustomerNumber() + " added..");
        System.out.println(customer.getCustomerNumber() + " added..");
    }

    // bulk insert
    public void addMultiple(Customer[] customers) {
        for (Customer customer : customers) {
            add(customer);
        }
    }

}
