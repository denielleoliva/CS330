public class Bicycle extends Vehicle
{
    private int wheels;
    private String color;

    //constructor
    public Bicycle()
    {
        // initialise instance variables
        wheels = 0;
        color = " ";
    }
    
    public void pedal(){
        System.out.println("Vehicle 'myBike' is now pedaling.");
    }
}
