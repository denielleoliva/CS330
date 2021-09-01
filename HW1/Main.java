import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        PointOfSale kiosk;
        kiosk = new Kiosk();

        PointOfSale store;
        store = new Store();

        while(true){
            System.out.println("**************************************");

            System.out.println("Are you at a Store(1) or a Kiosk(2)?");
            System.out.println("Enter 0 to exit.");
            System.out.print("Enter selection here: ");


            int choice = scan.nextInt();

            System.out.println("**************************************");
            System.out.println();
            System.out.println();
            System.out.println("**************************************");

            switch(choice){
                case 0:
                    break;
                case 1:
                    store.transactionType();
                    break;
                case 2:
                    kiosk.generateOrder();
                    kiosk.transaction();
                    break;
                default:
                    System.out.println("Enter valid option.");
            }
            if(choice == 0){
                break;
            }
        }



    }
}
