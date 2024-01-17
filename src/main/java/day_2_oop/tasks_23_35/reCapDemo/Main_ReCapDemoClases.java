package day_2_oop.tasks_23_35.reCapDemo;

public class Main_ReCapDemoClases {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int cemTopla = calculator.topla(3, 5);
        int cemCixma = calculator.cixma(10,2);
        int cemVurma = calculator.vurma(5,5);
        int cemBolme = calculator.bolme(10,2);
        System.out.println(cemTopla);
        System.out.println(cemCixma);
        System.out.println(cemVurma);
        System.out.println(cemBolme);
    }
}
