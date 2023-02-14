package model;

public class Perfume extends Product {
    public Perfume() {
    }

    public Perfume(int id, String name, int volume, int amount, double price) {
        super(id, name, volume, amount, price);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getVolume() {
        return super.getVolume();
    }

    @Override
    public void setVolume(int volume) {
        super.setVolume(volume);
    }

    @Override
    public int getAmount() {
        return super.getAmount();
    }

    @Override
    public void setAmount(int amount) {
        super.setAmount(amount);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }



    @Override
    public String toString() {
        return super.toString();
    }
}
