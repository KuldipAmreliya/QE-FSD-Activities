package com.example;

public class Bicycle implements BicycleParts,BicycleOperations{
    
   public int gears;
public int currentSpeed;

    Bicycle(int gear,int speed){
        this.gears=gear;
        this.currentSpeed=speed;
    }
    @Override
    public void applyBrale(int decrement) {
        currentSpeed=currentSpeed-decrement;
    }

    public void speedUp(int increment){
        currentSpeed=currentSpeed+increment;
    }

    public void bicycleDesc(){
        System.out.println("No of gears are "+gears+" and speed of bicycle is "+maxSpeed);
    }
}
