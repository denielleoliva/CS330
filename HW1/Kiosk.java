public class Kiosk extends PointOfSale {
    
    public Kiosk(){
        System.out.println("Kiosk POS Online!");

        payment = new Cash();
        
        orderId = new Ticket();

    }
}
