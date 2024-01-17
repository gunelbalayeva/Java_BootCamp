package day_3_inheritance.inheritance2;

public class FileLogger extends Logger {
    @Override
    public void log() {
        //super.log();
        System.out.println("File logged..");
    }

}
