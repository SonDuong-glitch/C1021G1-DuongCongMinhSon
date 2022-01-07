package thithu.phan2.controler;



import thithu.phan2.service.impl.GenuinePhoneImpl;

import java.util.Scanner;

public class MainControler {
    public static void MainMenu(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------Menu-------------");
            System.out.println("1.Genuine Phone");
            System.out.println("2.Hand Goods Phone");
            System.out.println("Choose your option");
            int choose = sc.nextInt() ;
            switch (choose){
                case 1:
                    MenuGenuinePhone();
                    break;
                case 2:
                    MenuHandGoodsPhone();
                    break;
                case 3:
                    System.exit(0);
                    break;
            }
        }while (true);
    }
    public static void  MenuGenuinePhone(){
        GenuinePhoneImpl phone = new GenuinePhoneImpl() ;
        do {
           Scanner sc = new Scanner(System.in);
           System.out.println("-------------Menu-------------");
           System.out.println("1.Add new Phone");
           System.out.println("2.Delete Phone");
           System.out.println("3.Display Phone");
           System.out.println("4.Search Phone");
           System.out.println("5.Back to Main Menu");
           int choose = sc.nextInt() ;
           switch (choose){
               case 1:
                   phone.addNEwPhone();
                   break;
               case 2:
                   phone.deletePhone();
                   break;
               case 3:
                   phone.displayPhoneList();
                   break;
               case 4:
                   phone.searchPhone();
                   break;
               case 5:
                   MainMenu();
                   break;
       }
        }   while (true);
    }
    public static void MenuHandGoodsPhone(){
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("-------------Menu-------------");
            System.out.println("1.Add new Phone");
            System.out.println("2.Delete Phone");
            System.out.println("3.Display Phone");
            System.out.println("4.Search Phone");
            System.out.println("5.Back to Main Menu");
            int choose = sc.nextInt() ;
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
        }   while (true);
    }
    public static void main(String[] args) {
    MainMenu();
    }
}
