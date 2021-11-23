package models;

import java.util.List;

public class Product {
    private String name;
    private int id;
    private  double price;
    private  int count;
    private double offer;
    private ProductPublisher productPublisher=new ProductPublisher(this);

    public int getId() {
        return id;
    }

    public double getOffer() {
        return offer;
    }

    public List<String> setOffer(double offer) {
        this.offer = offer;
       return productPublisher.notifyOfferProduct();

    }

    public Product(int id,String name, double price, int count) {
        this.id=id;
        this.name = name;
        this.price = price;
        this.count = count;


    }
    public void addToPublisher(){
        productPublisher=new ProductPublisher(this);
        productPublisher.notifyCountProduct();
    }
    public List<String> addCount(int count){
        this.count+=count;
       return productPublisher.notifyCountProduct();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public double calculateTotalPrice(){
        return price-price*offer;
    }

    public ProductPublisher getProductPublisher() {
        return productPublisher;
    }

    public void setProductPublisher(ProductPublisher productPublisher) {
        this.productPublisher = productPublisher;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", price=" + price +
                ", count=" + count +
                '}';
    }
}
