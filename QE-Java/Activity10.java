package com.example;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
    public static void main(String[] args) {
        Set<String> hs=new HashSet<>();
        hs.add("Zero");
        hs.add("one");
        hs.add("Two");
        hs.add("Three");
        hs.add("Four");
        hs.add("Six");
        System.out.println(hs.size());
        System.out.println(hs.remove("Zero"));
        
        System.out.println(hs.remove("eight"));
        System.out.println(hs.contains("one"));
        System.out.println(hs);
    }
}
