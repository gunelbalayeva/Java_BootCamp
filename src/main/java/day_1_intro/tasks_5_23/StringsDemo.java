package day_1_intro.tasks_5_23;

public class StringsDemo {
    public static void main(String[] args) {
        String s1 = " Bu gun hava cox gozeldir. ";
        System.out.println(s1);
        System.out.println("index: " + s1.length());
        System.out.println("5: " + s1.charAt(4));
        System.out.println(s1.concat(" Yasasin!"));
        System.out.println(s1.startsWith("B"));
        System.out.println(s1.endsWith("r"));
        System.out.println(s1.indexOf("un"));
        System.out.println(s1.lastIndexOf("ir"));
        String newMesaj = s1.replace(" ", "/");
        System.out.println(newMesaj);
        System.out.println(newMesaj.substring(2));
        System.out.println(newMesaj.substring(3, 6));

        for (String words : s1.split(" ")) {
            System.out.println(words);
        }
// search zamanai istifade olunur
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        // basda ve sondaki bosluqlari atacaq
        System.out.println(s1.trim());

    }


}
