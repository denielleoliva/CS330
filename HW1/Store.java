import java.util.Scanner;

public class Store extends PointOfSale{
    public int userChoice;
    TransactionBehavior temp;

    public Store(){
        
        System.out.println("Store POS Online!");

        //input.close();

    }

    public void transactionType(){

        while(true){
            Scanner input = new Scanner(System.in);
            System.out.println("0/ Cash");
            System.out.println("1/ Credit");
            System.out.println("2/ Exit");

            System.out.print("Transaction Type? ");
            int choice = Integer.valueOf(input.nextLine());

            switch(choice){
                case 0:
                    payment = new Cash();;
                    this.transaction();
                    break;
                case 1:
                    payment = new Credit();
                    this.transaction();
                    break;
                case 2:
                    //System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid input");
            }
            if(choice == 2){
                break;
            }
        }

    }

}
