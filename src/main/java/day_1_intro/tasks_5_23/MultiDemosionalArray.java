package day_1_intro.tasks_5_23;

public class MultiDemosionalArray {

    public static void main(String[] args) {

        String[][] seherler = new String[3][3];
        seherler[0][0] = "Istanbul";
        seherler[0][1] = "Bursa";
        seherler[0][2] = "Bilecik";
        seherler[1][0] = "Ankara";
        seherler[1][1] = "Konya";
        seherler[1][2] = "Karadeniz";
        seherler[2][0] = "Kayseri";
        seherler[2][1] = "Diyarbkir";
        seherler[2][2] = "Gaziantep";

        for (int i = 0; i <= 2; i++) {
            System.out.println("-------------");
            for (int j = 0; j <= 2; j++) {
                System.out.println(seherler[i][j]);
            }
        }
    }
}
