import java.math.BigInteger;
import java.util.Scanner;

public class Credit implements TransactionBehavior{
    public float totalDue;
    public float amountPaid;
    public float changeDue;
    public BigInteger cardNumber;

    /**
    * Provides functionality for credit transactions. 
    * 
    *
    * @param none
    * @return none
    */
    public void transaction(){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter card number: ");
        cardNumber = input.nextBigInteger();
        
        System.out.print("Enter amount due: ");
        totalDue = input.nextFloat();

        System.out.println("Thank you for your purchase!");

        System.out.println("**************************************");


    }

}
