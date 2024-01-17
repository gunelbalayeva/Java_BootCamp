package day_2_oop.tasks_23_35;

public class Clases {
    public void main(String[] args) {
        CostumManager manager = new CostumManager(); //101
        CostumManager manager2 = new CostumManager();//102
        manager = manager2; // artiq 101 deye adress yoxdur, cunki 102-ye oturuldu
        //101 referance istifade olunmadigi ucun GC terefinden silinir.
        manager.add();
        manager.deleted();
        manager.update();
        System.out.println(manager2);


    }

    /*
    Metodlar - Calculator dusunun burda biz toplama, cixma, vurma, bolme ve.s kimi
    riyazi emeliyyatlari icra edirik.
    Amma bir alis-veris sistemini dusunduyumuz zaman orda mehsullarin oldugunu bilirik.
    Biz mehsulu ne edirik? Mehsulu toplayib-cixmiriq, biz mehsul musteri ucun list edirik.
    Mehsulun detallarini gosteririk, mehsul elave edib, mehsul sile,update ede bilerik.
    Classlar referance type'dir.
    Classda deyisken yaratdigimiz zaman yaddasda ona uygun yer ayirmis oluruq(byte 1 bit, int 4 bit ve.s)
    Yaratdigimiz classi(umumiyyetle hansisa classi) istifade ede bilmeyimiz ucun new ile yaratmagimiz lazimdir
     /mes: Main main = new Main();
     ----------------------------------

      >>>>>>>>>> HEAP and STACK<<<<<<<<<<<<<<<<<<

     Yaddas 2 yere bolunur : Stack ve heap
             CostumerManager manager = new CostumerManager(); //101
             CostumerManager manager2 = new CostumerManager();// 102

             Bu iki yaradilan obyektler eynni metodlardan(add,update, delete)
              istifade etse de yaddasda ayri-ayri referance tuturlar

          -- manager - Stackda, new CostumerManager() hisse Heapda yer tutur
          -- manager2 - Stackda, new CostumerManager() hisse Heapda yer tutur

    Bir program yazarken developer new hisseye diqqet etmelidir,
    cunki bu yaddasda gereksiz yere serf etmeye getirib cixara bilir.
    Sadece ehtiyac oldugu zaman new yazmaq olar.
     */
    class CostumManager {
        public void add() {
            System.out.println("added..");
        }

        public void deleted() {
            System.out.println("deleted..");
        }

        public void update() {
            System.out.println("updated..");
        }
    }
}

