package day_1_intro;

public class Main {
    public static void main(String[] args) {
        //Don't repeat yorself
        String internetSobeButonu = "Intenet Sobesi";
        System.out.println(internetSobeButonu);

        // Stack - burda primitive deyerler olur ve bu deyere yeni deyer menimsedilen zaman
        // kohne deyer yaddasdan silinir

        int say1 = 10;
        int say2 = 20;
        say1 = say2; //say1 artiq say2-nin deyerini menimseyib 20 oldu
        say2 = 100;
        System.out.println(say1);
        //  System.out.println(say2);


//Heap -  burda non-primitive deyerleri saxlanir, adressleri ise heap yaddasda olur

        int[] saylar1 = {1, 2, 3, 4, 5};
        int[] saylar2 = {10, 20, 30, 40, 50};
        saylar1 = saylar2;//burda adressi menimsetdik, artiq saylar1 ,saylar2 adressini saxlayir.
        saylar2[0] = 100;
        // artiq saylar2 deyer siyahisini gosterecek, cunki adress saylar1 yazsaq da saylar2-ni gosterir
        System.out.println(saylar1[0]);

//Istisna veziyyet: bu deyer tip kimi olaraq deyismez qalacaq
        String s1 = "Ankara";
        String s2 = "Istanbul";
        s1 = s2;
        s2 = "Izmir";
        System.out.println(s1);

    }

    /*
    --------------------------
 Integer (int): Tamsayıları temsil eder. Örneğin, 5 veya -10 gibi pozitif veya negatif tam sayıları tutabilir.

Double: Ondalık sayıları (float) ve kesirli sayıları (double) temsil eder. Örneğin,
 3.14 veya -0.5 gibi ondalık veya kesirli sayıları tutabilir.

Boolean: Mantıksal değerleri temsil eder. Sadece iki değere sahip olabilir: true (doğru) veya
 false (yanlış). Mantıksal ifadelerde kullanılır.

Char: Tek bir karakteri temsil eder. Örneğin, 'A' veya '$' gibi bir karakteri tutabilir.
Tek tırnaklar içinde gösterilir.

String: Metin veya karakter dizilerini temsil eder. Örneğin, "Merhaba" veya
"Java Programlama" gibi metinleri tutabilir. Çift tırnaklar içinde gösterilir.

Array (Dizi): Aynı türdeki birden fazla veriyi tek bir değişkende tutmayı sağlar. Örneğin,
 int[] numbers = {1, 2, 3, 4, 5}; gibi bir dizi tanımlayabilir ve bu dizi içinde tam sayıları saklayabilirsiniz.

Object (Nesne): Java'nın herhangi bir sınıfından türeyebilen her şeyi temsil eder. Nesneler,
özelliklerini (veri alanları) ve davranışlarını (metodlar) içerir. Örneğin, String veya Integer
 gibi sınıflar nesne türüdür


  -------------------------------
  Primitive data tipleri :
1- Kesr saylar:
1.1-Float
1.2-Double
2-Tam Saylar ucun:
2.1-İnteger
2.2-Byte
2.3-Short
2.4-Long
diger data tipleri:
3-Karakter
3.1-Char 'Tek dirnaq qaydasi'
4-Mantıksal Değer
4.1-Boolean- = 1,0

Referans data Tipleri:

Class
Interface
Array
String
Enum
     */
}

