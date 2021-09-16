public class BallsSilver extends ChristmasTreeDecorator{
    
    public BallsSilver(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Silver Balls";
    }

    public int cost(){
        return christmasTree.cost() + 3;
    }

}