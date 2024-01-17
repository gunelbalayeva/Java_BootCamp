package day_1_intro.tasks_5_23;

public class MiniProje3 {
    public static void main(String[] args) {
        //6-->1,2,3
        //28-->1,2,4,7,14

        int number = 27;
        int total = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
        if (total == number) {
            System.out.println("mukemmel saydir");
        } else {
            System.out.println("deyildir");
        }

    }
}
