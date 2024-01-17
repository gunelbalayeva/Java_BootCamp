package day_2_oop.tasks_23_35;

public class Methods {
    public static void main(String[] args) {
        // Main default metoddur
        sayTap();
        //Don't repeat - functions yazaraq ozumuzu,yeni kodlarimizi tekrarlamagin qarsisini aliriq.

    }

    // Parametrsiz metod
    public static void sayTap() {
        int[] saylar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 5;
        boolean var = false;
        for (int say : saylar) {
            if (say == aranacak) {
                var = true;
                System.out.println(var);
                break;
            }
        }
        String mesaj = "";
        if (var) {
            mesaj = "say movcuddur";
            mesajVer(mesaj);

        } else {
            System.out.println("movcud deyil");
        }
    }

    // Parametrli metod
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}
