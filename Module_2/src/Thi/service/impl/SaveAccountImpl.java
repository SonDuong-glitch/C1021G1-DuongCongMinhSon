package Thi.service.impl;

import Thi.models.SaveAccount;
import Thi.service.ISaveAccount;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SaveAccountImpl implements ISaveAccount {
    public static final String File_Save_Accont = "E:\\C1021G1_DuongCongMinhSon\\Module_2\\src\\Thi\\data\\SaveAccountFile.csv";
    public static Scanner sc = new Scanner(System.in);
    public static List<SaveAccount> saveAccountList = new ArrayList<>();

    @Override
    public void addNew() {
        int id = 1;
        id += saveAccountList.size();
        System.out.println("Input Account Code");
        String accountCode = sc.nextLine();
        while (accountCode == null){
            System.out.println("Input again");
            accountCode = sc.nextLine();
        }
        System.out.println("Input Name ");
        String name = sc.nextLine();
        while (name == null){
            System.out.println("Input again");
            name = sc.nextLine();
        }
        System.out.println("Input date open account");
        String date = sc.nextLine();
        while (date == null || ! date.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")){
            System.out.println("Input again");
            date = sc.nextLine();
        }
        System.out.println("Input Money Save");
        double saveMoney = Double.parseDouble(sc.nextLine());
        while (saveMoney < 0){
            System.out.println(" Must > 0");
            saveMoney = Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input date to save money");
        String dateToSave = sc.nextLine();
        while (dateToSave == null || ! dateToSave.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")){
            System.out.println("Input again");
            dateToSave = sc.nextLine();
        }
        System.out.println("input Save Interest");
        double saveInterest = Double.parseDouble(sc.nextLine());
        while (saveInterest < 0){
            System.out.println(" Must > 0");
            saveInterest= Double.parseDouble(sc.nextLine());
        }
        System.out.println("Input Save Period");
        String datePeriod = sc.nextLine();
        while (datePeriod == null || ! datePeriod.matches("\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}")){
            System.out.println("Input again");
            datePeriod = sc.nextLine();
        }

        SaveAccount saveAccount = new SaveAccount(id, accountCode, name, date, saveMoney, dateToSave, saveInterest, datePeriod);
        saveAccountList.add(saveAccount);
        writeFile(File_Save_Accont,saveAccountList);
    }

    @Override
    public void deleteAccount() {
        System.out.println("Input code account you want to del");
        String codeToDel = sc.nextLine();
        for (int i = 0; i < saveAccountList.size(); i++) {
            if (codeToDel.equals(saveAccountList.get(i).getAccountCode())) {
                saveAccountList.remove(i);
            }
        }
        writeFile(File_Save_Accont,saveAccountList);
    }

    @Override
    public void displayAccount() {
        for (SaveAccount saveAccount : saveAccountList
        ) {
            System.out.println(saveAccount.toString());
        }
        List<SaveAccount> saveAccountList = ReadFileSaveAcc(File_Save_Accont);
    }

    @Override
    public void searchAccount() {
        System.out.println("Input code account you want to search");
        String codeToSearch = sc.nextLine();
        for (int i = 0; i < saveAccountList.size(); i++) {
            if (codeToSearch.equals(saveAccountList.get(i).getAccountCode())) {
                saveAccountList.get(i).toString();
            }
        }
    }

    public static void writeFile(String patch, List<SaveAccount> saveAccountList) {
        try {
            FileWriter fileWriter = new FileWriter(patch);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (SaveAccount saveAccount : saveAccountList) {
                bufferedWriter.write(saveAccount.getIdAccount() + ","
                        + saveAccount.getAccountCode() + ","
                        + saveAccount.getAccountName() + ","
                        + saveAccount.getAccountDate() + ","
                        + saveAccount.getDateSaveMoney() +","
                        + saveAccount.getSaveInterest() +","
                        + saveAccount.getPeriod()+"\n"
                );
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static List<SaveAccount> ReadFileSaveAcc(String patch){
        List<SaveAccount> saveAccountList1 = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(patch));
            String line;
            String temp[];
            SaveAccount saveAccount;
            while ((line = bufferedReader.readLine()) == null ){
                temp = line.split(",");
                saveAccount = new SaveAccount(Integer.parseInt(temp[0]),temp[1],temp[2],temp[3],Double.parseDouble(temp[4]),temp[5],Double.parseDouble(temp[6]),temp[7] );
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
        return saveAccountList1;
    }
}
