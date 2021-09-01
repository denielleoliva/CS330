import java.util.Scanner;

public class Store extends PointOfSale{
    private int userChoice;
    TransactionBehavior temp;

    public Store(){
        Scanner input = new Scanner(System.in);

        System.out.println("Store POS Online!");

        do{
            System.out.println("0/ Cash Payment");
            System.out.println("1/ Credit Payment");
            System.out.println("2/ Exit to Main Menu");

            userChoice = input.nextInt();

            switch(userChoice){
                case 0:
                    payment = new Cash();
                case 1:
                    payment = new Credit();
                default:
                    System.out.println("Invalid choice. Choose option provided.");
                    break;
            }
        }while(userChoice!=2);

        input.close();

    }

}
