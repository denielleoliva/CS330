public class Ruffles extends ChristmasTreeDecorator{
    
    public Ruffles(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , ruffles";
    }

    public int cost(){
        return christmasTree.cost() + 1;
    }

}
