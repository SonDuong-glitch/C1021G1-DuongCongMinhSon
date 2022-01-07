package BaiThiThucHanh.controler;

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
    public static void   MenuExportProduct(){
        do {
            System.out.println("1. Add new product");
            System.out.println("2.Delete Product");
            System.out.println("3.Display list product");
            System.out.println("4.Search product");
            System.out.println("5.Back to main menu");
            System.out.println("Please choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){

            }
        }while (true);
    }
    public static void   MenuImportProduct(){
        do {
            System.out.println("1. Add new product");
            System.out.println("2.Delete Product");
            System.out.println("3.Display list product");
            System.out.println("4.Search product");
            System.out.println("5.Back to main menu");
            System.out.println("Please choose your option");
            Scanner sc = new Scanner(System.in);
            int choose = sc.nextInt();
            switch (choose){

            }
    }while (true);
    }
    public static void main(String[] args) {
        MainMenu();
    }
}
