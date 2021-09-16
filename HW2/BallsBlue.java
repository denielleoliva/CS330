public class BallsBlue extends ChristmasTreeDecorator{
    
    public BallsBlue(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Blue Balls";
    }

    public int cost(){
        return christmasTree.cost() + 2;
    }

}
