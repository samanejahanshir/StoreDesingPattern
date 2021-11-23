package models;

import java.util.ArrayList;
import java.util.List;

public class ProductPublisher {
    Product product;
    List<Subscriber> subscriberList = new ArrayList<>();

    public ProductPublisher(Product product) {
        this.product = product;

    }

    public void subscribe(Subscriber s) {
        subscriberList.add(s);

    }

    public void unsubscribe(Subscriber s) {
        subscriberList.remove(s);
    }

    public List<String> notifyCountProduct() {
        List<String> messages = new ArrayList<>();
        if (product.getCount() > 0) {
            for (Subscriber customer : subscriberList) {
                messages.add(customer.notifyMe(product.getName() + " was charged ... send email to : "));
            }

        }
        return messages;
    }

    public List<String> notifyOfferProduct() {
        List<String> messages = new ArrayList<>();
        if (product.getOffer() > 0) {
            for (Subscriber customer : subscriberList) {
                messages.add(customer.notifyMe(product.getName() + " have offer for sale ... send email to : "));
            }

        }
        return  messages;
    }

}
