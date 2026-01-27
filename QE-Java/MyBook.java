package com.example;

 abstract class Book {
    public String title;
    abstract void setTitle(String s);

    abstract void getTitle();
}

public class MyBook extends Book{
    public static void main(String[] args) {
        MyBook newNovel=new MyBook();
        newNovel.setTitle("Twisted Love");
        newNovel.getTitle();
    }

    public void getTitle(){
        System.out.println(title);
    }

    public void setTitle(String s){
        title=s;
    }
}
