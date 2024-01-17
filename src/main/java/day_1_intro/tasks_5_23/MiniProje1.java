package day_1_intro.tasks_5_23;

public class MiniProje1 {
    public static void main(String[] args) {
//bug - mentiqsel xetalardir.
// Asal sayi bulma programi

        int number = 2;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isPrime = true;
        if (number < 1) {
            System.out.println("not found");
            return;
        }


// 2-den 24-e qeder dongu qurduq
        for (int i = 1; i < number; i++) {

            if (number % 2 == 0) {
                isPrime = false; // asal deyil
            }
        }
        if (isPrime) {
            System.out.println("tekdir");
        } else {
            System.out.println("cemdir");
        }
    }
}
