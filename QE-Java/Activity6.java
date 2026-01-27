package com.example;

public class Activity6  {
    public static void main(String[] args) throws InterruptedException {
        Plane plane=new Plane(10);
        plane.onBoard("Kuldip");
        plane.onBoard("Milind");
        plane.onBoard("Pranshu");
        
        plane.takeOff();
        
        plane.getPassengers();
        
        System.out.println();
        plane.land();
        plane.getLastTimeLanded();

        Thread.sleep(5000);
    }
}
