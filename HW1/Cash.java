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

        //this is negative idk why
        changeDue = totalDue - amountPaid;

        System.out.println("Change Due: " + changeDue);

        input.close();
    }


}
