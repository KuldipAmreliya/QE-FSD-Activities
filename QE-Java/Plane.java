package com.example;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<String> passengers;
    private int maxPassengers;
    private LocalDate lastTimeTookOf;
    private LocalDate lastTimeLanded;

    public Plane(int num){
        passengers=new ArrayList<>();
        this.maxPassengers=num;
    }

    public void onBoard(String str){
        passengers.add(str);
        System.out.println(str+" onBoarded Succesfully");
    }
 LocalDate localDate=LocalDate.now();
    public void takeOff(){
       
        System.out.println("The current time is :"+localDate);
    }

    public void land(){
        lastTimeLanded=localDate;
        passengers.clear();
    }

    public void getLastTimeLanded(){
        System.out.println("The plane was landed on: "+lastTimeLanded);
    }

    public void getPassengers(){
        for(String str:passengers){
            System.out.print(str+" ");
        }
    }

}
