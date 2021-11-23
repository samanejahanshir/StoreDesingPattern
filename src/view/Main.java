package view;

import models.CustomerObserver;
import models.Product;
import models.ProductPublisher;
import service.StoreService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CustomerObserver samane=new CustomerObserver();
        samane.setUsername("samane");
        samane.setPassword("123456");
        samane.setEmail("samane@gmail.com");
        samane.addOneToPublisherList(StoreService.products.get(2));
       // StoreService.products.get(2).addToPublisher();
        StoreService.products.get(2).getProductPublisher().subscribe(samane);
        for (String message : StoreService.products.get(2).addCount(2)) {
            System.out.println(message);
        }
        for (String message : StoreService.products.get(2).setOffer(0.20)) {
            System.out.println(message);
        }
        CustomerObserver tara=new CustomerObserver();
        tara.setUsername("tara");
        tara.setPassword("1476");
        tara.setEmail("tara@gmail.com");
        tara.addOneToPublisherList(StoreService.products.get(1));
        // StoreService.products.get(2).addToPublisher();
        StoreService.products.get(1).getProductPublisher().subscribe(tara);
        for (String message : StoreService.products.get(1).addCount(1)) {
            System.out.println(message);
        }
        for (String message : StoreService.products.get(1).setOffer(0.20)) {
            System.out.println(message);
        }






    }
   /* public  static void showListProducts(){
        System.out.println("------ Products ------ ");
        for (Product product : StoreService.products) {
            System.out.println(product);
        }
        System.out.println("enter id of product for notify...");
        Scanner scanner=new Scanner(System.in);
        try {
           int idProduct=scanner.nextInt();

        }catch (NumberFormatException | InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }*/
}
