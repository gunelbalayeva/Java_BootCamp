package day_2_oop.tasks_23_35.clasesWithAtrubutes;

public class Product {
    //--- Field and Attribute

    //---  Encaptulation:
    // int id; - default olaraq publicdir
    //private - sadece yaradildigi sahede kecerldir, diger classlar onu vasiteci olmadan gore bilmir
    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    public Product() {
    }

    public Product(int id, String name, String description, double price, int stockAmount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.stockAmount = stockAmount;
    }
/*
  ---- Getter and Setter
  Get - getirmek
  Set - deyeri set etme, yeni deyer vermekdir
  -- get yazdiqsa, set yamaga mmecbur deyilik, yeni sadece readOnly olsun isteye bilerik.
  -- yaxud da writeOnly, tekce set olsun da isteye bilerik.
 */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        // -- this. - Product classin id-i, beraberdir setId metodunun icindeki parametr id-e
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
