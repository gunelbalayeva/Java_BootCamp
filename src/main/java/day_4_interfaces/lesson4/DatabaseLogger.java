package day_4_interfaces.lesson4;

public class DatabaseLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("database loglandi ");
    }
}
