package week4.binary_file.baitap.service.imp;

import week4.binary_file.baitap.model.Product;
import week4.binary_file.baitap.service.IProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ServiceProduct implements IProduct {
    public static final String OUT_PUT = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\week4\\binary_file\\baitap\\output.txt";
    ArrayList<Product> prd = new ArrayList<>();
    @Override
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input ID");
        int iD =  sc.nextInt();
        sc.nextLine();
        System.out.println("Input name product");
        String name = sc.nextLine();
        System.out.println("Input name company");
        String nameCompany = sc.nextLine();
        System.out.println("Input discription");
        String anyThing = sc.nextLine();
        Product product = new Product(iD,name,nameCompany,anyThing);
        prd.add(product);
    }

    @Override
    public void displayProduct( ) {
        for (int i = 0 ; i < prd.size();i++){
            System.out.println(prd.get(i).toString());
        }
    }

    @Override
    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        System.out.println("Input name of product you want to find");
        String search = sc.nextLine() ;
        for (int i = 0; i < prd.size(); i++) {
            if (prd.get(i).getName().equals(search)){
                System.out.println("Product you want to find is : " + prd.get(i).getName());
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Product is does not exist");
        }
    }

    @Override
    public void displayTxt() throws IOException, ClassNotFoundException {
        List<Product> productList = new ArrayList<>();
        FileInputStream fileInputStream = new FileInputStream(OUT_PUT);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        productList = (List<Product>) objectInputStream.readObject();
        objectInputStream.close();
        for (Product product : productList) {
            System.out.println(product);
        }
    }

}
