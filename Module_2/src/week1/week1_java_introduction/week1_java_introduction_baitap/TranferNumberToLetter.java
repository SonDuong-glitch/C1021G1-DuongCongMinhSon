package week1.week1_java_introduction.week1_java_introduction_baitap;

import java.util.Scanner;

public class TranferNumberToLetter {
    public static void main(String[] args){
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Number you want to change");
        number = scanner.nextInt();
        int chuc = number/10;
        int tram = number/100;
        int donvi;
        if(number >= 0  && number <=10){
            switch (number){
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }else if(number>10 && number < 100){
            switch (number%10) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("Fourteen");
                    break;
                case 5:
                    System.out.println("Fiveteen");
                    break;
                case 6:
                    System.out.println("Sixteen");
                    break;
                case 7:
                    System.out.println("Seventeen");
                    break;
                case 8:
                    System.out.println("Eighteen");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("twenty");
                    break;
                default:
                    System.out.println("");
                    break;
            }
    }
}
}
