package day_3_inheritance.task2;

public class StudentManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getName()+ " student added..");
    }
}
