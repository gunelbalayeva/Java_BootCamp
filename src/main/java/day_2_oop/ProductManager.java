package day_2_oop;

public class ProductManager {

    public void addToCart(Product product){
        System.out.println("Sepete eklendi: "+product.getName());
        System.out.println("Sepete eklendi: "+product.getId());
        System.out.println("Sepete eklendi: "+product.getDetail());
    }
}
