package BaiThiThucHanh.service.impl;

import BaiThiThucHanh.models.ExportProducts;
import BaiThiThucHanh.models.ImportedProducts;
import BaiThiThucHanh.service.IImportProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportProductImpl implements IImportProduct {
    public static final String File_ImportProduct = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\BaiThiThucHanh\\data\\importProduct.csv";
    private static final List<ImportedProducts> importedProductsList = new ArrayList<>();

    @Override
    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Id product");
        String iDProduct = sc.nextLine();
        System.out.println("Input product code");
        String productCode = sc.nextLine();
        System.out.println("input name product");
        String nameProduct = sc.nextLine();
        System.out.println("Input price");
        double priceForSale = Double.parseDouble(sc.nextLine());
        while (priceForSale < 0 ){
            System.out.println("Price must > 0");
            System.out.println("input agian");
            priceForSale = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input quanlity");
        double quanlily = Double.parseDouble(sc.nextLine());
        while (quanlily < 0 ){
            System.out.println("quanlily must > 0");
            System.out.println("input agian");
            quanlily = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input producer");
        String producer = sc.nextLine();
        System.out.println("input import price");
        double importPrices = Double.parseDouble(sc.nextLine());
        while (importPrices < 0 ){
            System.out.println("importTax must > 0");
            System.out.println("input agian");
            importPrices = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input import provice");
        String importProvince = sc.nextLine();
        System.out.println("Input Import Tax");
        double importTax = Double.parseDouble(sc.nextLine());
        while (importTax < 0 ){
            System.out.println("importTax must > 0");
            System.out.println("input agian");
            importTax = Double.parseDouble(sc.nextLine());
        }
        ImportedProducts importProduct = new ImportedProducts(iDProduct, productCode, nameProduct, priceForSale, quanlily, producer, importPrices, importProvince, importTax);
        importedProductsList.add(importProduct);
        writeFileProduct(File_ImportProduct, importedProductsList);

    }

    @Override
    public void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input code product yout want to delete");
        String codeForDelete = sc.nextLine();
        for (int i = 0; i < importedProductsList.size(); i++) {
            if (codeForDelete.equals(importedProductsList.get(i).getProductCode())) {
                System.out.println("Do you want delete this product");
                String option = sc.nextLine();
                if (option.equals("Yes")) {
                    importedProductsList.remove(i);
                } else {
                    continue;
                }
            }
        }
    }

    @Override
    public void displayProduct() {
        List<ImportedProducts> importedProductsList  = null;
        importedProductsList = ReadFileProduct(File_ImportProduct);
        for (ImportedProducts importedProducts : importedProductsList
        ) {
            System.out.println(importedProducts.toString());
        }
    }

    @Override
    public void searchProduct() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1:Search by code product");
            System.out.println("2.Search by name product");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    searchByCode();
                    break;
                case 2:
                    searchByname();
                    break;
                case 3:
                    System.exit(0);
                    break;

            }
        } while (true);
    }

    public static void searchByCode() {
        System.out.println("input code product yout want to search");
        Scanner sc = new Scanner(System.in);
        String codeForSearch = sc.nextLine();
        for (int i = 0; i < importedProductsList.size(); i++) {
            if (codeForSearch.equals(importedProductsList.get(i).getProductCode())) {
                System.out.println(importedProductsList.get(i).toString());
            }
        }
    }

    public static void searchByname() {
        System.out.println("input name product yout want to search");
        Scanner sc = new Scanner(System.in);
        String nameForSearch = sc.nextLine();
        for (int i = 0; i < importedProductsList.size(); i++) {
            if (nameForSearch.equals(importedProductsList.get(i).getNameProduct())) {
                System.out.println(importedProductsList.get(i).toString());
            }
        }
    }

    public static void writeFileProduct(String filepath, List<ImportedProducts> importedProductsList) {
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ImportedProducts importedProducts : importedProductsList) {
                bufferedWriter.write(importedProducts.getiDProduct() + ","
                        + importedProducts.getProductCode() + ","
                        + importedProducts.getNameProduct() + ","
                        + importedProducts.getPriceForSale() + ","
                        + importedProducts.getQuanlily() + ","
                        + importedProducts.getProducer() + ","
                        + importedProducts.getImportPrices() + ","
                        + importedProducts.getImportProvince() + ","
                        + importedProducts.getImportTax() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<ImportedProducts> ReadFileProduct(String filepatch) {
        List<ImportedProducts> importedProductsList = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filepatch));
            String line;
            String[] temp;
            ImportedProducts importedProducts;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                importedProducts = new ImportedProducts(temp[0], temp[1], temp[2], Double.parseDouble(temp[3]), Double.parseDouble(temp[4]), temp[5], Double.parseDouble(temp[6]), temp[7], Double.parseDouble(temp[8]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return importedProductsList;
    }
}
