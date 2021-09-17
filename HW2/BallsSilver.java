public class BallsSilver extends TreeDecorator{
    
    public BallsSilver(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Silver Balls";
    }

    public int cost(){
        return christmasTree.cost() + 3;
    }

}