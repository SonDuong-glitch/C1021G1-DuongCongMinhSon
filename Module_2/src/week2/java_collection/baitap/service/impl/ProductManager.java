package week2.java_collection.baitap.service.impl;
import week2.java_collection.baitap.model.Product;
import week2.java_collection.baitap.service.IProductManager;
import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager implements IProductManager {
    ArrayList<Product> products = new ArrayList<>();
    @Override
    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id Product:");
        String id = sc.nextLine();
        System.out.println("Input Name Product:");
        String name = sc.nextLine();
        System.out.println("input Date Of Manufacture");
        String dateOfManufacture = sc.nextLine();
        System.out.println("Input Expiry Of product:");
        String expiry = sc.nextLine();
        System.out.println("Input Quality product:");
        int cost = sc.nextInt();
        Product product = new Product(id,name,dateOfManufacture,expiry,cost);
        products.add(product);
    }

    public void editProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id of product you want to change information");
        String idToEdit = sc.nextLine();
        for(int i = 0 ; i<products.size(); i++){
            if (idToEdit.equals(products.get(i).getIdProduct())){
                System.out.println("Input again name product");
                String name = sc.nextLine();
                System.out.println("Input again DOM");
                String dom = sc.nextLine();
                System.out.println("Input again Expiry");
                String expiry =  sc.nextLine();
                System.out.println("Input again Cost");
                int cost =  sc.nextInt();
                products.get(i).setNameProduct(name);
                products.get(i).setDateOfManufacture(dom);
                products.get(i).setExpiry(expiry);
                products.get(i).setCost(cost);
            }
        }
    }

    @Override
    public void removeProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id you want to remove");
        String idRemove = sc.nextLine();
        for(int i = 0 ; i < products.size() ; i++){
            if (idRemove.equals(products.get(i).getIdProduct())){
                products.remove(i);
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product: products
             ) {
            System.out.println(product);
        }
    }

    @Override
    public void searchProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Name product you want to search ?");
        String nameSearch =  sc.nextLine();
        for (int i = 0 ; i < products.size(); i++){
            if(products.get(i).getNameProduct().equals(nameSearch)){
                System.out.println(products.get(i));
            }
        }

    }

    @Override
    public void sortProduct() {
        products.sort(Product::compareTo);
        System.out.println(products);
    }
}
