package day_3_inheritance.tasks_36_39.polymorphism_demo;

public class DatabaseLogger extends BaseLogger{
    @Override
    public void log(String message) {
       // super.log(message);
        System.out.println("Loged to database..");
    }

}
