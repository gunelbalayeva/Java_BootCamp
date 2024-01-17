package day_3_inheritance.task2;

public class TaskMain {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(1);
        user1.setName("Gunel");
        user1.setEmail("balayeva@gmail.com");

        User user2 = new User();
        user2.setId(2);
        user2.setName("Nazli");
        user2.setEmail("balayevanazli@gmail.com");

        User user3 = new User(3,"Muzeffer","balayevmuzaffar@gmail.com");

        StudentManager studentManager = new StudentManager();
        studentManager.add(user1);
        studentManager.add(user2);
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(user3);


    }
}
