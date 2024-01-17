package day_2_oop.odev1;

public class Course {
    String teacherName;
    String courseName;
    String platform;
    public Course() {
    }

    public Course(String teacherName, String courseName, String platform) {
        this.teacherName = teacherName;
        this.courseName = courseName;
        this.platform = platform;
    }

    public Course(String courseName, String platform) {
        this.courseName = courseName;
        this.platform = platform;
    }
}
