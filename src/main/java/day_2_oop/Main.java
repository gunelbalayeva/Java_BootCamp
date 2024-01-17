package day_2_oop;

public class Main {
    public static void main(String[] args) {
        // referance, instance yaratmaq
        Product product2 = new Product();
        product2.setId(2);
        product2.setName("Lenavo V15");
        product2.setDetail("8 GB Ram");
        product2.setDiscount(10);
        product2.setUnitPrice(16000);
        System.out.println(product2.getUnitPriceAfterDiscount());

        Catagory catagory = new Catagory();
        catagory.setId(1);
        catagory.setName("Ickiler");

        Catagory catagory1 = new Catagory();
        catagory.setId(2);
        catagory.setName("Yemekler");

        System.out.println(catagory.getId());
        System.out.println(catagory.getName());


    }
}

/*
        // Indi Product array yaradib length metodu ile cagiracagiq, console'da 1 cixacaq
      //  Product[] products = {product1, product2, product3};
        for (Product productt : products) {
            System.out.println(product.name);
        }
        System.out.println(products.length);
        Catagory catagory1 = new Catagory();
        catagory1.id = 1;
        catagory1.name = "Computer";

        Catagory catagory2 = new Catagory();
        catagory2.id = 2;
        catagory2.name = "Ev";
        ProductManager productManager = new ProductManager();
        productManager.addToCart(product1);
        productManager.addToCart(product2);
        productManager.addToCart(product3);

    }
    // Classlar referansdir

 */