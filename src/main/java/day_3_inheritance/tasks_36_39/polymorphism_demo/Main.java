package day_3_inheritance.tasks_36_39.polymorphism_demo;

public class Main {
    /*
    Polymorphism - Coxbicimlilik.
    Aralarinda inheritance varsa bir-birinin referance tuta bilirler.
     */
    public static void main(String[] args) {
      /*  DatabaseLogger logger =new DatabaseLogger();
        logger.log("database message");
       */
       /* BaseLogger[]loggers = new BaseLogger[]{new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
        for (BaseLogger logger: loggers){
         logger.log("logger message:");
        }
        */
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.log();
        System.out.println("--------------");
        CustomerManager customerManager1 = new CustomerManager(new FileLogger());
        customerManager1.log();

    }

}
