package day_1_intro.tasks_5_23;

public class Variables {
    public static void main(String[] args) {
//Java casesansetive ,yeni boyuk-kicik herfe duyarli bir dildir.
// Eger bir classa hansi ad versek boyuk-kicik yazilacaq sekilde isleyecek.

        System.out.println("Sagird sayi:10");
        System.out.println("Sagird sayi:10");
        System.out.println("Sagird sayi:10");
        System.out.println("Sagird sayi:10");

        /*
        Kodumuzu her sagird sayi deyisdikce gelib tek-tek deyismek mecburiyyetinde qaliriq.
        Databasedan bu datani aldigimiz zaman ne olacaq?
        Dtabase 4 defe muraciet edib eyni datani elde etmeyimiz lazimdir.
        Bizi bunu 1 defe etmeyimiz lazimdir, vaxta va yaddasa qenaet ve.s baximdan.
        Buna gore de dta tiplerinden istifade edeceyik.

       */
        int sagirdSay = 10;
        // adlandirmalar da CamelCase olmalidir.
        System.out.println("Sagird sayi:" + sagirdSay);
        //yeni 1 defe yaz, her yerde istifade et prinsipi - reusebility
        // -----------
        String mesaj = "Sagird sayi: ";
        System.out.println(mesaj + sagirdSay);
/*
Biz deyiskenleri(Variables) islediyimiz blokda tekrar-tekrar istifade ede bilmek
ve yaddasda az yer tuta bilmek ucun istifade edirik
 */

    }
}
