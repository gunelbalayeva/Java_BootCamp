package day_1_intro.tasks_5_23;

public class MiniProje4 {
    public static void main(String[] args) {

        //220-284
        int num1 = 220;
        int num2 = 284;
        int result1 = 0;
        int result2 = 0;

        for (int i = 1; i < num1; i++) {
            if (num1 % i == 0) {
                result1 = result1 + i;
            }
        }
        for (int i = 1; i < num2; i++) {
            if (num2 % i == 0) {
                result2 = result2 + i;
            }
        }

        if (num1 == result2 && num2 == result1) {
            System.out.println("dost reqemdir");
        } else {
            System.out.println("deyildir");
        }


    }
}
