public class Car extends Vehicle
{
    private int wheels;
    private String color;

    //constructor
    public Car()
    {
        // initialize instance variables
        wheels = 0;
        color = " ";
    }
    

    public void start()
    {
        System.out.println("Vehicle 'myCar' is now starting.");
    }
}
