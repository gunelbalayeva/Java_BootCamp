package day_3_inheritance.task2;

public class InstructorManager extends UserManager {
    @Override
    public void add(User user) {
        System.out.println(user.getName()+ " instructor added..");
    }
}
