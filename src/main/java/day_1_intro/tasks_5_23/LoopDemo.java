package day_1_intro.tasks_5_23;

public class LoopDemo {
    public static void main(String[] args) {
        // For
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("for finished");
        // While
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i = i + 2;
        }
        System.out.println("while finished");

        //Do-While
        int a = 100;
        do {
            System.out.println(a);
            a++;
        } while (a < 5);
        System.out.println("do-while finished");

    }
// Loop - bir programda bir-birine benzeyen islerin ard-ard a tekrar olmasidir.
// For - sertin telebi odendiyi zamanda davam edecek, meselen 1-10 arasi dovr tekrar etdikce tekrarlanacaq.
// While -eger sert odenmirse donguye girmeyecek, koddan cixacaq.
// Do-While - sert odenmese de donguye girecek.
}
