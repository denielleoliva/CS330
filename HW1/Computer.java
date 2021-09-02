public class Computer implements OrderBehavior{
    static int counter = 0;

    int orderNum = 0;

    /**
    * Order number for store POS
    * Order number is generated not entered
    *
    * @param none
    * @return none
    */

    public void generateOrder(){
        counter++;
        orderNum = counter;
        
        
        System.out.println("Store Order Number: " + orderNum);
    }

}
