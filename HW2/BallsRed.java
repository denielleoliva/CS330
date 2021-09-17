public class BallsRed extends TreeDecorator{
    
    public BallsRed(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Red Balls";
    }

    public int cost(){
        return christmasTree.cost() + 1;
    }

}
