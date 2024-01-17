package day_1_intro.tasks_5_23;

public class ArraysDemo {
    public static void main(String[] args) {

        String s1 = "Nazli";
        String s2 = "Gunel";
        String s3 = "Gultac";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


//Array
        String[] student = new String[3];
        student[0] = "Nazli";
        student[1] = "Gunel";
        student[2] = "Gultac";

        for (int i = 0; i < student.length; i++) {
            System.out.println(student[i]);
        }
        for (String stud :student){

        }

    }
}
