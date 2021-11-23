package service;

import models.CustomerObserver;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class StoreService {
    public static List<CustomerObserver> customerObservers = new ArrayList<>();
    public static List<Product> products = List.of(new Product(1, "book", 2000, 0),
            (new Product(2, "shoes", 4000, 0))
            , (new Product(3, "bag", 6000, 0)));

}
