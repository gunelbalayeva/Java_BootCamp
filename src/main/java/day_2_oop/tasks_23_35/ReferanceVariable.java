package day_2_oop.tasks_23_35;

public class ReferanceVariable {
    public static void main(String[] args) {
        //Value type
        int num1 = 10;// 101
        int num2 = 20;// 102
        num2 = num1;// 102 ==101
        num1 = 30;
        System.out.println(num2);//run-time zamani 101 cagirilacaq ,yeni 10 cixacaq.

// ----Arrays referance
        int[] numbers1 = new int[]{1, 2, 3};// 101
        ;
        int[] numbers2 = new int[]{4, 5, 6};// 102

        numbers2 = numbers1;//
        numbers1[0] = 10;
        System.out.println(numbers2[2]);//  int[] numbers1 = new int[]{1, 2, 3};// 101
        System.out.println(numbers2[0]);//  numbers1[0] = 10; buna gore run edende 0-inci undex 10 gosterir

//----Arraylar referance tipdir, integer,String,Byte olmasinin hec bir onemi yoxdur


    }
}
