package model;

public class Toy {
    private int id;
    private String name;
    private String brand;
    private int quantity;
    private double weight;

    public Toy(int id, String name, String brand, int quantity, double weight) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.quantity = quantity;
        this.weight = weight;
    }

    public Toy() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void decreaseQuantity(){
        this.quantity--;
    }
}
