package week2.dsa_stack_queue.baitap.reverse_element_in_integer_array;

import java.util.Scanner;
import java.util.Stack;

public class IntegerStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> wStack = new Stack<>();
        Stack<String> stackString = new Stack<>();
//        wStack.push(4);
//        wStack.push(6);
//        wStack.push(7);
//        int size = wStack.size();
//        for (int i = 0 ; i < size; i++){
//            System.out.println(wStack.pop());
//        }
        System.out.println("Nhập vào chuỗi");
        String s = sc.nextLine();
        for(int i = 0 ; i < s.length();i++){
            stackString.push(s.charAt(i)+"");
        }
        System.out.println("Chuỗi trước khi đảo ngược"+stackString);
        System.out.println("Chuỗi đảo ngược:"  );
        for(int i = 0 ; i < s.length();i++){
            System.out.print(stackString.pop());
        }
    }
}
