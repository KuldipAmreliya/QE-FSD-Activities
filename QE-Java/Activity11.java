package com.example;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
public static void main(String[] args) {
    Map<Integer,String> colors=new HashMap<>();

    colors.put(1,"Green");
    colors.put(2,"Red");
    colors.put(3,"Blue");
    colors.put(4,"Yellow");
    colors.put(5,"Pink");

    System.out.println(colors);

    colors.remove(2);
    System.out.println(colors.containsKey("Green"));
    System.out.println(colors.size());
}
}
