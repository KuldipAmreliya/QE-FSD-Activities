package com.example;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        System.out.println("This is code for insertion sort algorithm");
        int[] arr={8,7,6,5,4};
        System.out.println(Arrays.toString(insertion(arr)));
    }

    static int[] insertion(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            int key=arr[i];
            int j=i-1;

            while (j>=0 && arr[j]>key) {
                arr[j+1]=arr[j];
                j=j-1;
            }
            arr[j+1]=key;
        }
        return arr;
    }
}
