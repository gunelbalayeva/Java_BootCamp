package day_3_inheritance.tasks_36_39;
import day_3_inheritance.tasks_36_39.inheritance_task.Customer;
import day_3_inheritance.tasks_36_39.inheritance_task.CustomerManager;
import day_3_inheritance.tasks_36_39.inheritance_task.Employee;
import day_3_inheritance.tasks_36_39.inheritance_task.EmployeeManager;

public class Main {
    /*
    -- Inheritance - miras demekdir.
    -- Iki obyekt arasinda olan mirasdir.
    Bir obyekt digerine miras buraxar.
   --Bir class basqa classi 1 defe ekstends ede biler.

     */
    public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.bestEmployee();
        employeeManager.add();
        employeeManager.list();
        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.list();
    }
}
