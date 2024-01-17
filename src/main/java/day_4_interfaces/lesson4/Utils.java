package day_4_interfaces.lesson4;

public class Utils {
    public static void runLoggers(Logger[]loggers,String message){
        for (Logger logger : loggers){
            logger.log(message);
        }
    }
}
