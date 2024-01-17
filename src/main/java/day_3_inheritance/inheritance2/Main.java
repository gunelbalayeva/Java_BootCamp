package day_3_inheritance.inheritance2;

public class Main {
    // -- Bir-birinin alternativi olan kodlar ucun if yazilmaz
    public static void main(String[] args) {

        CustomerManager manager = new CustomerManager();
        manager.add(new FileLogger());
        manager.add(new EmailLogger());
        manager.add(new DatabaseLogger());


    }
}
