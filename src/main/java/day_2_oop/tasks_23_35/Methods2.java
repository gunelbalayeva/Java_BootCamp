package day_2_oop.tasks_23_35;

public class Methods2 {
    public static void main(String[] args) {
        int topla = topla(3, 3);
        System.out.println(topla);
    }

    public static void add() {
        System.out.println("added..");
    }

    public static void delete() {
        System.out.println("deleted..");
        return;
    }

    public static void update() {
        System.out.println("uptaded..");
    }

    // Iki parametrli geriye deyer return eden Integer metod
    public static int topla(int say1, int say2) {
        return say1 + say2;
    }

    // Tek parametrli geriye deyer return eden String metod
    public static String mesaj(String mesaj) {
        return "Java-React-BootCamp";
    }
    // Bunlara void operasyon deyirler. Sdece isi gormesini isteyirik, bize geri melumat gondermesini yox.
    // Return - eden function, bize melumat qaytarir.
    // Void olan metodlari bir deyiskene menimsede bilmerik(String, Integer kimi, Collections kimi)
    // Return demek, bitir demekdir, amma geriye deyer qaytaran metodlarda olan return bize mueyyen deyer qaytaracaq
    //

}
