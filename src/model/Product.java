package model;

public class Product {
    private int id;
    private String name;
    //    thể tích, dung tích sản phẩm
    private int volume;
    //    số lượng sản phẩm
    private int amount;
    private double price;

    public Product() {

    }

    public Product(int id, String name, int volume, int amount, double price) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.amount = amount;
        this.price = price;
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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }


}
