package Thi.controller;

import Thi.models.SaveAccount;
import Thi.service.impl.SaveAccountImpl;

import java.util.Scanner;

public class MainControler {
    public static void  MainMenu(){
        do {
            System.out.println("--------------------------MainMenu--------------------------");
            System.out.println("1.Menu PaymentAccount");
            System.out.println("2.Menu SaveAccount");
            System.out.println("3.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Choose your option");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    MenuPaymentAccount();
                    break;
                case 2:
                    MenuSaveAccount();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static void MenuPaymentAccount(){
            do {
            System.out.println("--------------------------Menu PaymentAccount--------------------------");
            System.out.println("1.Add New Account");
            System.out.println("2.Delete Account");
            System.out.println("3.Display List Account");
            System.out.println("4.Search account");
            System.out.println("5.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Your option");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
            }while (true);
    }
    public static void MenuSaveAccount(){
        SaveAccountImpl saveAccount = new SaveAccountImpl();
        do {
            System.out.println("--------------------------Menu SaveAccount--------------------------");
            System.out.println("1.Add New Account");
            System.out.println("2.Delete Account");
            System.out.println("3.Display List Account");
            System.out.println("4.Search account");
            System.out.println("5.Exit");
            Scanner sc = new Scanner(System.in);
            System.out.println("Input Your option");
            int choose = sc.nextInt();
            switch (choose){
                case 1:
                    saveAccount.addNew();
                    break;
                case 2:
                    saveAccount.deleteAccount();
                    break;
                case 3:
                    saveAccount.displayAccount();
                    break;
                case 4:
                    saveAccount.searchAccount();
                    break;
                case 5:
                    MainMenu();
                    break;
            }
        }while (true);
    }

    public static void main(String[] args) {
        MainMenu();
    }
}