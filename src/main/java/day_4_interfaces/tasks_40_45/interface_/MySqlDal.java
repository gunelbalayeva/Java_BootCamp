package day_4_interfaces.tasks_40_45.interface_;

public class MySqlDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Mysql added");
    }
}
