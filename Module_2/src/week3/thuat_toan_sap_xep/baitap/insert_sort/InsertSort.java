package week3.thuat_toan_sap_xep.baitap.insert_sort;

import java.util.Arrays;

public class InsertSort {
    public static void sort(int [] array){
        for (int i = 1 ; i < array.length;i++){
            int currentElement = array[i];
            int k = i-1;
            for(;k>=0 && array[k] > currentElement;k--){
                array[k+1] = array[k];
            }
            array[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        int [] myArray = {5,42,50,2,9,65,7};
        sort(myArray);
        System.out.println(Arrays.toString(myArray));
    }
}
