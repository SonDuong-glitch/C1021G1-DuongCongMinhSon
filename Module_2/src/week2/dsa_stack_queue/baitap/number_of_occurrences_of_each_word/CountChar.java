package week2.dsa_stack_queue.baitap.number_of_occurrences_of_each_word;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi");
        String str = sc.nextLine();
        Map<String,Integer> treeMap = new TreeMap<>();
        String character;
        for (int i = 0 ; i < str.length();i++){
            character = String.valueOf(str.charAt(i));
            if( treeMap.containsKey(character)){
                int currectValue = treeMap.get(character);
                treeMap.replace(character,currectValue+1);
            }else{
                treeMap.put(character,1);
            }
        }
        System.out.println(treeMap);
    }
}
