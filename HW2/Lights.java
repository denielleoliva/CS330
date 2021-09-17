public class Lights extends TreeDecorator{
    
    public Lights(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Lights";
    }

    public int cost(){
        return christmasTree.cost() + 5;
    }

}
