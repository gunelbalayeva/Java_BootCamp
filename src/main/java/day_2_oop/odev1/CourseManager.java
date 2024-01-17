package day_2_oop.odev1;

public class CourseManager {

    public void courseManager(Course course) {
        System.out.println(course.teacherName + " adli muellimin " + course.courseName + " adli kursu " + course.platform + "platformasindan secildi");

    }

    public void courseNameWrite(Course write) {
        System.out.println(write.platform + "'da " + write.courseName + " adli kurs movcuddur");

    }

}
