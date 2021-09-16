public class Star extends ChristmasTreeDecorator{
    
    public Star(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " a Star";
    }

    public int cost(){
        return christmasTree.cost() + 4;
    }

}
