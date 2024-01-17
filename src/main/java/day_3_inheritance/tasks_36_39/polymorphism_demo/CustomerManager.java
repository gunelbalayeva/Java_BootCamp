package day_3_inheritance.tasks_36_39.polymorphism_demo;

public class CustomerManager {
    private BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void log(){
    this.logger.log("log message..");
        System.out.println("customer logged..");
}
}
