public class BallsBlue extends TreeDecorator{
    
    public BallsBlue(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Blue Balls";
    }

    public int cost(){
        return christmasTree.cost() + 2;
    }

}
