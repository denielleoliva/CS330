public class Ribbons extends TreeDecorator{
    
    public Ribbons(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Ribbons";
    }

    public int cost(){
        return christmasTree.cost() + 2;
    }

}