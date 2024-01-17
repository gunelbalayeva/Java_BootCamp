package day_3_inheritance;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        IndividualCustomer engin = new IndividualCustomer();
        IndividualCustomer gunel = new IndividualCustomer();
        IndividualCustomer gultac = new IndividualCustomer();

        Customer[] customers = {engin, gunel, gultac};
        customerManager.addMultiple(customers);


    }
}
