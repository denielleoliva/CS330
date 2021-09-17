public class Ruffles extends TreeDecorator{
    
    public Ruffles(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , ruffles";
    }

    public int cost(){
        return christmasTree.cost() + 1;
    }

}
