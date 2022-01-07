package thithu.phan2.service.impl;

import thithu.phan2.models.GenuinePhone;
import thithu.phan2.models.Phone;
import thithu.phan2.service.IGenuinePhone;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenuinePhoneImpl implements IGenuinePhone {
    public static final String File_GenuinePhone = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\thithu\\phan2\\data\\GenuinePhone.Exportproduct.csv";
    List<GenuinePhone> phoneList = new ArrayList<>();

    public static void WriteFileGenuinePhone(String patch, List<GenuinePhone> phoneList) {
        try {
            FileWriter fileWriter = new FileWriter(patch);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (GenuinePhone phone : phoneList) {
                bufferedWriter.write(phone.getId() + ","
                        + phone.getNameOfPhone() + ","
                        + phone.getPriceForSale() + ","
                        + phone.getQuantily() + ","
                        + phone.getProducer() + ","
                        + phone.getWarrantyPeriod() + ","
                        + phone.getWarrantyCoverage() +
                        "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void addNEwPhone() {
        int id = 1;
        id += phoneList.size();
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Name Product:");
        String name = sc.nextLine();
        while (name == null) {
            System.out.println("Input again");
            name = sc.nextLine();
        }
        System.out.println("Input price: ");
        double price = Double.parseDouble(sc.nextLine());
        while (price < 0) {
            System.out.println("Price must be > 0");
            System.out.println("Input again!");
            price = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input quanlity");
        double quanlity = Double.parseDouble(sc.nextLine());
        while (quanlity < 0) {
            System.out.println("Quanlity must be > 0");
            System.out.println("Input again!");
            quanlity = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input producer");
        String producer = sc.nextLine();
        System.out.println("Input Warranty Period");
        int warrantyPeriod = Integer.parseInt(sc.nextLine());
        while (warrantyPeriod > 720 && warrantyPeriod < 0) {
            System.out.println(" Warranty Period Must be < 720");
            System.out.println(" Input agian");
            warrantyPeriod = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Input Warranty Coverage");
        String warrantyCoverage = sc.nextLine();
        while (warrantyCoverage == null || warrantyCoverage.matches("[V|v][I|i][E|e][T|t][N|n][A|a][M|m]")) {
            System.out.println("Input again");
            warrantyCoverage = sc.nextLine();
        }
        Phone phone = new GenuinePhone(id, name, price, quanlity, producer, warrantyPeriod, warrantyCoverage);
        phoneList.add((GenuinePhone) phone);
        WriteFileGenuinePhone(File_GenuinePhone, phoneList);
    }

    @Override
    public void deletePhone() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input id of phone to delete");
        int idToDelete = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < phoneList.size(); i++) {
            if (phoneList.get(i).getId() == idToDelete) {
                System.out.println("Do you want delete this product ? ");
                String choose = sc.nextLine();
                if (choose.equals("Yes")) {
                    phoneList.remove(i);
                } else {
                    continue;
                }
            }
        }
        WriteFileGenuinePhone(File_GenuinePhone, phoneList);
    }

    @Override
    public void displayPhoneList() {
        for (Phone phone : phoneList
        ) {
            System.out.println(phone.toString());
        }
    }

    @Override
    public void searchPhone() {
        Scanner sc = new Scanner(System.in);
        int idToSearch = sc.nextInt();
        for (int i = 0; i < phoneList.size(); i++) {
            if (idToSearch == phoneList.get(i).getId()) {
                System.out.println(phoneList.get(i).toString());
            }
        }
    }
}
