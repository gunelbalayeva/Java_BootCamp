package day_1_intro.tasks_5_23;

public class MiniProje5 {
    public static void main(String[] args) {
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
        if (var) {
            System.out.println("movcuddur");
        } else {
            System.out.println("movcud deyil");
        }
    }
}
