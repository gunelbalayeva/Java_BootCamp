package day_2_oop.odev1;

public class Main {
    public static void main(String[] args) {

        Course course = new Course("Engin Demirog", "Java-React-BootCamp", "Discord ");
        Course course1 = new Course("Java-React-BootCamp", "Discord");
        CourseManager courseManager = new CourseManager();
        CourseManager manager = new CourseManager();

        manager.courseNameWrite(course1);
        courseManager.courseManager(course);

    }

}
