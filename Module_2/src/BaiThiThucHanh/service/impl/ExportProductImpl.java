package BaiThiThucHanh.service.impl;

import BaiThiThucHanh.models.ExportProducts;
import BaiThiThucHanh.service.IExportProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExportProductImpl implements IExportProduct {
    public static final String File_ExportProduct = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\BaiThiThucHanh\\data\\Exportproduct.csv";
    public static List<ExportProducts> exportProductsList = new ArrayList<>();
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
        ExportProducts exportProducts = new ExportProducts(iDProduct,productCode,nameProduct,priceForSale,quanlily,producer,exportProduct,exportingCountry);
        exportProductsList.add(exportProducts);
        writeFileProduct(File_ExportProduct,exportProductsList);
    }

    @Override
    public void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("input code product yout want to delete");
        String codeForDelete = sc.nextLine();
        for(int i = 0 ; i < exportProductsList.size() ; i++){
            if(codeForDelete.equals(exportProductsList.get(i).getProductCode())){
                System.out.println("Do you want delete this product");
                String option = sc.nextLine();
                if(option.equals("Yes")){
                    exportProductsList.remove(i);
                }else{
                    continue;
                }
            }
        }
    }

    @Override
    public void displayProduct() {
        for (ExportProducts exportProducts: exportProductsList
             ) {
            System.out.println(exportProducts.toString());
        }
    }

    @Override
    public void searchProduct() {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("1:Search by code product");
            System.out.println("2.Search by name product");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    searchByCode();
                    break;
                case 2:
                    searchByname();
                    break;
                case 3:
                    System.exit(0);

            }
        }while (true);
    }
    public static void searchByCode(){
        System.out.println("input code product yout want to search");
        Scanner sc = new Scanner(System.in);
        String codeForSearch = sc.nextLine();
        for(int i = 0 ; i < exportProductsList.size() ; i++){
            if(codeForSearch.equals(exportProductsList.get(i).getProductCode())){

                exportProductsList.get(i).toString();
            }
        }
    }
    public static void searchByname(){
        System.out.println("input name product yout want to search");
        Scanner sc = new Scanner(System.in);
        String nameForSearch = sc.nextLine();
        for(int i = 0 ; i < exportProductsList.size() ; i++){
            if(nameForSearch.equals(exportProductsList.get(i).getNameProduct())){

                exportProductsList.get(i).toString();
            }
        }
    }
    public static void writeFileProduct(String filepath , List<ExportProducts> exportProductsList){
        try {
            FileWriter fileWriter = new FileWriter(filepath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ExportProducts exportProducts : exportProductsList){
                bufferedWriter.write(exportProducts.getiDProduct()+","
                +exportProducts.getProductCode()+","
                +exportProducts.getNameProduct()+","
                +exportProducts.getPriceForSale()+","
                +exportProducts.getQuanlily()+","
                +exportProducts.getProducer()+","
                +exportProducts.getExportProduct()
                +exportProducts.getExportingCountry()+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<ExportProducts> ReadFileProduct(String filepatch){
        List <ExportProducts> exportProductsList = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(filepatch));
            String line;
            String [] temp;
            ExportProducts exportProducts ;
            while ((line = bufferedReader.readLine()) != null ){
                temp = line.split(",");
                exportProducts = new ExportProducts(temp[0],temp[1],temp[2],Double.parseDouble(temp[3]),Double.parseDouble(temp[4]),temp[5],Double.parseDouble(temp[6]),temp[7]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader.close();
        }
        return exportProductsList;
    }
}
