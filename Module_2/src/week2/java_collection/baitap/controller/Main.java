package week2.java_collection.baitap.controller;

import week2.java_collection.baitap.service.impl.ProductManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductManager test = new ProductManager();
        do {
            System.out.println("1. Add product");
            System.out.println("2. Edit product");
            System.out.println("3. Remove product");
            System.out.println("4. Display product");
            System.out.println("5. Search product");
            System.out.println("6. Sort product");
            System.out.println("7. Exit program ^^");
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your option :D ");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    test.addProduct();
                    break;
                case 2:
                    test.editProduct();
                    break;
                case 3:
                    test.removeProduct();
                    break;
                case 4:
                    test.displayProduct();
                    break;
                case 5:
                    test.searchProduct();
                    break;
                case 6:
                    test.sortProduct();
                    break;
                case 7:
                    System.out.println("Already exit program!!!");
                    System.exit(0);
                    break;
            }
        }while (true);
    }
}
