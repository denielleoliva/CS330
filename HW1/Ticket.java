import java.util.Scanner;

/**
  * Order number for kiosk POS
  * Order number is entered not generated
  *
  * @param none
  * @return none
  */
public class Ticket implements OrderBehavior{
    int orderNum;

    public void generateOrder(){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Ticket Order Number: ");
        orderNum = scan.nextInt();

        System.out.println("Kiosk Order Number: "+orderNum);
    }

}
