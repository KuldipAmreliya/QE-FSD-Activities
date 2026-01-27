package com.example;
import java.util.*;

public class Activity9 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("Kuldip King");
        list.add("Milind Master");
        list.add("Pranshu Piyakkad");
        list.add("Akshat Akdu");
        list.add("Akash Aandu-Pandu");

        System.out.println(list.get(2));
        System.out.println(list.contains("Kuldip King"));
        System.out.println(list.size());
        System.out.println(list.remove(0));

        System.out.println(list.size());
        System.out.println(list);
    }
}
