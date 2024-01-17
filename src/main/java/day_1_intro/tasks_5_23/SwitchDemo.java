package day_1_intro.tasks_5_23;

public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("ugurlu netice");
                break;
            case 'B':
                System.out.println("yaxsidir");
                break;
            case 'C':
                System.out.println("kecerldir");
                break;
            case 'F':
                System.out.println("kesildiniz");
                break;
        }
    }
}
