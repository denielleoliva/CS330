public class BallsRed extends ChristmasTreeDecorator{
    
    public BallsRed(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Red Balls";
    }

    public int cost(){
        return christmasTree.cost() + 1;
    }

}
