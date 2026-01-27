package com.example;

public class Activity2 {
    public static void main(String[] args) {
        System.out.println("Here is program to check if sum of all 10 is 30 or not");

        int[] arr={10,20,10,10,40};
        System.out.println(sumCheck(arr));

    }

    static boolean sumCheck(int[] arr){
        int ans=0;
        for(int num:arr){
            if(num==10){
                ans+=num;
            }
        }
        return ans==30;
    }
}
