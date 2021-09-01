public abstract class PointOfSale{
    
    TransactionBehavior payment;
    OrderBehavior orderId;

    public PointOfSale(){

    }

    public void transaction(){
        payment.transaction();
    }

    public void generateOrder(){
        orderId.generateOrder();
    }

    public void setTransaction(TransactionBehavior tb){
        payment = tb;
    }

    public void setOrder(OrderBehavior ob){
        orderId = ob;
    }

    public void transactionType(){

    }

}