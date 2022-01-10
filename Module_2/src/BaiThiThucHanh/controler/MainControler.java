package BaiThiThucHanh.controler;

import BaiThiThucHanh.models.ImportedProducts;
import BaiThiThucHanh.service.impl.ExportProductImpl;
import BaiThiThucHanh.service.impl.ImportProductImpl;

import java.util.Scanner;

public class MainControler {
    public static void MainMenu() {
        do {
            System.out.println("------------------MenuProduct------------------");
            System.out.println("1.ExportProduct");
            System.out.println("2.ImportProduct");
            System.out.println("3.Exit");
            System.out.println("Choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    MenuExportProduct();
                    break;
                case 2:
                    MenuImportProduct();
                    break;
                case 3:
                    System.out.println("System Exit ");
                    System.exit(0);
                    break;
            }
        } while (true);
    }

    public static void MenuExportProduct() {
        ExportProductImpl exportProduct = new ExportProductImpl();
        do {
            System.out.println("1. Add new product");
            System.out.println("2.Delete Product");
            System.out.println("3.Display list product");
            System.out.println("4.Search product");
            System.out.println("5.Back to main menu");
            System.out.println("Please choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    exportProduct.addNewProduct();
                    break;
                case 2:
                    exportProduct.deleteProduct();
                    break;
                case 3:
                    exportProduct.displayProduct();
                    break;
                case 4:
                    exportProduct.searchProduct();
                    break;
                case 5:
                    MainMenu();
                    break;
            }
        } while (true);
    }

    public static void MenuImportProduct() {
        ImportProductImpl importProduct = new ImportProductImpl();
        do {
            System.out.println("1. Add new product");
            System.out.println("2.Delete Product");
            System.out.println("3.Display list product");
            System.out.println("4.Search product");
            System.out.println("5.Back to main menu");
            System.out.println("Please choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    importProduct.addNewProduct();
                    break;
                case 2:
                    importProduct.deleteProduct();
                    break;
                case 3:
                    importProduct.displayProduct();
                    break;
                case 4:
                    importProduct
                            .searchProduct();
                    break;
                case 5:
                    MainMenu();
                    break;
            }
        } while (true);
    }

    public static void main(String[] args) {
        MainMenu();
    }
}
