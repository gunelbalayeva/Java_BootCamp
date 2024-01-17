package day_4_interfaces.tasks_40_45.interface_;

public class OracleCustomerDal implements ICustomerDal{
    @Override
    public void add() {
        System.out.println("Oracle added");
    }
}
