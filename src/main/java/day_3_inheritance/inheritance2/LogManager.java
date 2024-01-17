package day_3_inheritance.inheritance2;

public class LogManager {
    public void log(int logType) {
        if (logType == 1) {
            System.out.println("Database loglandi..");
        } else if (logType == 2) {
            System.out.println("File loglandi..");
        } else {
            System.out.println("Email loglandi..");
        }

    }
    /*
    --- Loglama tipleri:
    1. Database
    2.File
    3.Email
     */

}
