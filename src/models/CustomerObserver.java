package models;

import java.util.ArrayList;
import java.util.List;

public class CustomerObserver implements Subscriber {
    private String Username;
    private String password;
    private Long mobileNumber;
    private String email;
    private String address;
    List<Product> publisherList=new ArrayList<>();

    public void addOneToPublisherList(Product product) {
        this.publisherList.add(product);
    }
    public void removeOneFromPublisherList(Product product) {
        this.publisherList.remove(product);
    }
    public List<Product> getPublisherList() {
        return publisherList;
    }

    public void setPublisherList(List<Product> publisherList) {
        this.publisherList = publisherList;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(Long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String notifyMe(String message) {
        return message+" "+email;
    }
}
