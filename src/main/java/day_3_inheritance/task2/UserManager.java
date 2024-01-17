package day_3_inheritance.task2;

public class UserManager {
    public void add(  User user){
        System.out.println(user.getName()+" user added..");

    }

    @Override
    public String toString() {
        return "UserManager";
    }
}
