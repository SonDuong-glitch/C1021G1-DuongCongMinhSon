package week4.binary_file.baitap.controller;

import week4.binary_file.baitap.model.Product;
import week4.binary_file.baitap.service.imp.ServiceProduct;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        do {
            ServiceProduct product = new ServiceProduct();
            System.out.println("1.Add product");
            System.out.println("2.Display product");
            System.out.println("3.Search product");
            System.out.println("4.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your option");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    product.addProduct();
                    break;
                case 2:
                    product.displayProduct();
                    break;
                case 3:
                    product.searchProduct();
                    break;
                case 4:
                    product.displayTxt();
                    break;
                case 5:
                    System.exit(0);
            }
        }while(true);
    }
}
