package day_4_interfaces.tasks_40_45;

public class AbstractMain {
    public static void main(String[] args) {
        Customer_Manager customer_manager = new Customer_Manager();
        customer_manager.baseDatabaseManager = new OracleDatabaseManager();
        customer_manager.baseDatabaseManager = new SQL_ServerManager();
        customer_manager.getCustomers();
    }
}
