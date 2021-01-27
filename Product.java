package Eshop;

public class Product {
    protected String name;
    protected int id;
    protected double price;
    protected int discount;

    public Product(String name, int id, double price, int discount) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id+1000;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void changePrice(double price){
        this.price = price;
    }

    public void changeDiscount(int discount){
        this.discount=discount;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                '}';
    }
}
