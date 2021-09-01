
import java.util.Scanner;

public class Cash implements TransactionBehavior {
    public float totalDue;
    public float amountPaid;
    public float changeDue;

    public void transaction(){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter amount due: ");
        totalDue = input.nextFloat();

        System.out.print("Enter amount paid: ");
        amountPaid = input.nextFloat();

        if(amountPaid<totalDue){
            while(totalDue>0){
                
                if(amountPaid<totalDue){
                    System.out.println("*****INSUFFICIENT FUNDS*****");
                    totalDue = totalDue - amountPaid;
                    System.out.print("Amount Due: ");
                    System.out.printf("%.2f", totalDue);
                    System.out.print("Enter amount paid: ");
                    amountPaid = input.nextFloat();
                }else{
                    break;
                }

                
            }
           

        }

        
        changeDue = amountPaid - totalDue;

        System.out.print("Change Due: ");
        System.out.printf("%.2f", changeDue);
        System.out.println();

        System.out.println("Thank you for your purchase!");

    }


}
