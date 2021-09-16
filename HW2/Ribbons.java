public class Ribbons extends ChristmasTreeDecorator{
    
    public Ribbons(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Ribbons";
    }

    public int cost(){
        return christmasTree.cost() + 2;
    }

}