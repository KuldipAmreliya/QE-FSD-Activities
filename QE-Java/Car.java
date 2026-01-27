package com.example;

public class Car {
    public String color;
    public String transmission;
    public int make;
    public int tyres;
    public int doors;

    Car(){
        tyres=4;
        doors=4;
    }

    public void displayCharacteristics(){
        System.out.println("The color of car is : "+color);
        System.out.println("The transmission of car is: "+transmission);
        System.out.println("The car was made in: "+make);
        System.out.println("Total tyres in car are :"+tyres);
        System.out.println("Car has total :"+doors+"Doors");
    }

    public void accelarate(){
        System.out.println("Car is moving forward");
    }

    public void brake(){
        System.out.println("Car has stopped");
    }
    
}
