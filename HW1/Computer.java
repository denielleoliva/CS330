public class Computer implements OrderBehavior{
    static int counter = 0;

    int orderNum = 0;

    public void generateOrder(){
        counter++;
        orderNum = counter;
        
        
        System.out.println("Store Order Number: " + orderNum);
    }

}
