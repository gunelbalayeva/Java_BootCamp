package day_4_interfaces;

import day_4_interfaces.lesson4.*;

public class Main {
    public static void main(String[] args) {
        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new SmsLogger()};

        CustomerManager customerManager = new CustomerManager(loggers);

        Customer gunel = new Customer(1, "Gunel", "Balayeva");

        customerManager.add(gunel);

    }
}
