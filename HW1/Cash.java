
import java.util.Scanner;

public class Cash implements TransactionBehavior {
    public double totalDue;
    public double amountPaid;
    public double changeDue;

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
                    System.out.println("Amount Due: ");
                    System.out.printf("%.2f", totalDue);
                    System.out.print("Enter amount paid: ");
                    amountPaid = input.nextFloat();
                }else{
                    break;
                }

                
            }
           

        }


        changeDue = amountPaid - totalDue;

        changeDue = Math.round(changeDue*100.0)/100.0;
        System.out.print("Change Due: ");
        System.out.printf("%.2f", changeDue);
        System.out.println();

        System.out.println("Thank you for your purchase!");

    }


}
