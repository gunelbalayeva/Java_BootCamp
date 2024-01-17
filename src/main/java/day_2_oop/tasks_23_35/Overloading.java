package day_2_oop.tasks_23_35;

public class Overloading {
    // Overloading - eyni adli metodun 1-den cox paramterleri olmasidir.

    public static void main(String[] args) {
        topla(2, 3);
       int cem =  topla(10, 5, 4);
        System.out.println(cem);
    }

    public static int topla(int a, int b) {
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        return(a + b) - c;
    }
}
