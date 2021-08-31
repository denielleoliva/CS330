import java.io.*;

/* CS330
 * Exercise 1 - OOO
 * Denielle Oliva
 * Demitri Bannoura
 * August 24, 2021
 */

public class Main
{
    public static void main(String []args){
        Car myCar = new Car();
        
        myCar.start();
        
        Bicycle myBike = new Bicycle();
        
        myBike.pedal();
        
        //Polymorphism test
        Vehicle poly = new Car();
        System.out.println("Vehicle Polymorphism:");
        System.out.println("  Vehicle 'poly' is now a car.");
        poly = new Bicycle();
        System.out.println("  Vehicle 'poly' is now a bicycle.");


    }
}
