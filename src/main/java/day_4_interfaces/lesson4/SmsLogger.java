package day_4_interfaces.lesson4;

public class SmsLogger implements Logger {

    @Override
    public void log(String message) {
        System.out.println("sms gonderildi");
    }
}
