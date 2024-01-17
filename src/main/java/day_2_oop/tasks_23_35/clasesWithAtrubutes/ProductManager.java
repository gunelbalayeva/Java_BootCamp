package day_2_oop.tasks_23_35.clasesWithAtrubutes;

public class ProductManager {
    public void add(Product product) {
        //JDBC ile database qeyd etmek olacaq
        System.out.println("Mehsul elave edildi: " + product.getName());
    }






   /*
         ----SOLID prinsipi ----
  --- S - Single Responsiplity Principle - bir class tekce 1 isi gormelidir
  --- Bir metod sadece 1 is gormelidir
  --- Bir if sadece 1 is gormelidir
  --- Product classi hem deyisenleri ozunde saxlayib, hem metodlari da 1 classda tutmamalidir.
  --- Bunlari bir-birinden ayirmaq lazimdir, onemlidir.

      */
}
