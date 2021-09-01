
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
            while(!(totalDue<0)){
                System.out.println("*****INSUFFICIENT FUNDS*****");
                totalDue = totalDue - amountPaid;
                System.out.println("Amount Due: "+totalDue);
                System.out.print("Enter amount paid: ");
                amountPaid = input.nextFloat();
            }
           

        }

        
        changeDue = amountPaid - totalDue;

        System.out.println("Change Due: " + changeDue);

    }


}
