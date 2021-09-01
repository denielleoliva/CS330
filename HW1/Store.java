import java.util.Scanner;

public class Store extends PointOfSale{
    public int userChoice;
    TransactionBehavior temp;

    public Store(){
        
        System.out.println("Store POS Online!");

        orderId = new Computer();

        //input.close();

    }

    public void transactionType(){

        while(true){
            Scanner input = new Scanner(System.in);

            System.out.println("**************************************");
            System.out.println();
            System.out.println();
            System.out.println("**************************************");

            this.generateOrder();

            System.out.println("1/ Cash");
            System.out.println("2/ Credit");
            System.out.println("0/ Exit");

            System.out.print("Transaction Type? ");
            int choice = Integer.valueOf(input.nextLine());

            switch(choice){
                case 1:
                    payment = new Cash();;
                    this.transaction();
                    break;
                case 2:
                    payment = new Credit();
                    this.transaction();
                    break;
                case 0:
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
