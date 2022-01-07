package BaiThiThucHanh.service.impl;

import BaiThiThucHanh.models.ExportProducts;
import BaiThiThucHanh.service.IImportProduct;

import java.util.Scanner;

public class ImportProductImpl implements IImportProduct {

    @Override
    public void addNewProduct() {
        Scanner sc = new Scanner(System.in);
//        String iDProduct, String productCode, String nameProduct, double priceForSale, double quanlily, String producer, double exportProduct, String exportingCountry
        System.out.println("Input Id product");
        String iDProduct = sc .nextLine();
        System.out.println("Input product code");
        String productCode = sc.nextLine();
        System.out.println("input name product");
        String nameProduct = sc.nextLine();
        System.out.println("Input price");
        double priceForSale = Double.parseDouble(sc.nextLine());
        System.out.println("Input quanlity");
        double quanlily = Double.parseDouble(sc.nextLine());
        System.out.println("Input producer");
        String producer = sc.nextLine();
        System.out.println("input export product");
        double  exportProduct = Double.parseDouble(sc.nextLine());
        System.out.println("Input exporting country");
        String exportingCountry = sc.nextLine();

    }
    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void displayProduct() {

    }

    @Override
    public void searchProduct() {

    }
}
