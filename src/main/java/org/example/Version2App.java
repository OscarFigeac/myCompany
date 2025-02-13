package org.example;

import java.time.LocalDate;
import java.util.Scanner;

public class Version2App {
    public static void main(String[] args) {
        SupDeliveries supDeliveries = new SupDeliveries();
        Scanner kb = new Scanner(System.in);
        //setting values to instances of the class Stock
        Stock stock = new Stock();
        stock.add(new Item("iPhone", "iP154", 134, 55, 100, 250.99, "Apple123", true));
        stock.add(new Item("Laptop", "Lap123", 122, 45, 60, 735.27, "HP123", false));
        stock.add(new Item("Protein powder", "PP167", 43, 20, 25, 41.25, "ON667", true));
        stock.add(new Item("Keyboards", "Kb773", 35, 15, 20, 12.90, "KB881", true));
        stock.add(new Item("Creatine", "Cr245", 25, 5, 40, 19.99, "ON557", false));
        stock.add(new Item("Dumbbells", "Db553", 50, 2, 100, 34.55, "IM678", false));
        stock.add(new Item("Coors", "Co333", 40, 20, 75, 5.75, "Ib341", true));


        //setting values to delivery
        for (int i = 0; i < 3; i++) {//looping 3 times to create 3 items
            System.out.println("Enter the name of the delivered item");
            String itemName = kb.nextLine();
            System.out.println("Enter the amount of items delivered");
            int quantity = kb.nextInt();
            kb.nextLine();//ints get stuck

            Item item = stock.findItem(itemName);
            if (item == null){
                System.out.println("Item not found");
            }
            else {
                item.setQuantityInStock(quantity + item.getQuantityInStock());
                supDeliveries.addDelivery(new Delivery(itemName, LocalDate.now(), quantity));
                item.setOnOrderFlag(false);
                System.out.println(i+1 + " Replaced");
            }
        }

        //creating orders for OrderBook
        SupOrderBook supOrderBook = new SupOrderBook();
        supOrderBook.add(new SupOrder("Db553", LocalDate.now(), 12,"Db553"));
        supOrderBook.add(new SupOrder("Co333", LocalDate.of(2023, 12, 31), 32, "Co333"));
        supOrderBook.add(new SupOrder("Kb773", LocalDate.of(2024, 3, 25), 10, "Kb773"));

        //Deleting from Joe Smith
        System.out.println("All deliveries deleted: " + supDeliveries.deleteDeliveries("Joe Smith"));

        //Cheapest Item
        System.out.println("Cheapest Item: " + stock.findCheapest());

        //Dearest Item
        System.out.println("Dearest Item: " + stock.findDearest());

        //Received on a specific date inComing is empty?
        System.out.println(supDeliveries.findAllDeliveries(LocalDate.of(2023, 12, 1)));

        //Finding all deliveries of product 1
        System.out.println(supDeliveries.findAllDeliveries("Laptop"));
    }
}
