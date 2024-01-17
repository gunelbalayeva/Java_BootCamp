package day_1_intro.tasks_5_23;

public class RecapDemo {
    public static void main(String[] args) {
        int say1 = 25;
        int say2 = 20;
        int say3 = 2;
        int enboyuk = say1;

        if (enboyuk < say2) {
            enboyuk = say2;
        } else if (enboyuk < say3) {
            enboyuk = say3;
        }
        System.out.println("en boyuk: " + enboyuk);


    }
}
