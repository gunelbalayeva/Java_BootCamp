package day_4_interfaces.lesson4;

public class EmailLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("email gonderildi");
    }
}
