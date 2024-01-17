package day_2_oop;

public class Catagory {
    private int id;
    private String name;

    // Bos parametrsiz default constructor
    public Catagory() {

    }

    // Parametrli constructor
    public Catagory(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
