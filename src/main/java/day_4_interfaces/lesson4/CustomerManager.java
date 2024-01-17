package day_4_interfaces.lesson4;
public class CustomerManager {
    // Dependency Injection
    private Logger[] loggers;
    public CustomerManager(Logger[] loggers) {
        this.loggers = loggers;
    }

    // Loosly - tightly copled
    public void add(Customer customer) {
        System.out.println("customer added: " + customer.getFirstName());
         Utils.runLoggers(loggers, customer.getFirstName());
    }

    public void delete(Customer customer) {
        System.out.println("deleted: " + customer.getFirstName());
        Utils.runLoggers(loggers, customer.getFirstName());

    }

}
