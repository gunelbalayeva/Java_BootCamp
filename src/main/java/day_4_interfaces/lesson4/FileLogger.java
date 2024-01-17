package day_4_interfaces.lesson4;

public class FileLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println("File loglandi " );
    }
}
