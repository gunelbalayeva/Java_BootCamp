package day_3_inheritance.inheritance2;

public class EmailLogger extends Logger {
    @Override
    public void log() {
      //  super.log();
        System.out.println("Email logged..");
    }
}
