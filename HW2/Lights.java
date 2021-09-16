public class Lights extends ChristmasTreeDecorator{
    
    public Lights(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , Lights";
    }

    public int cost(){
        return christmasTree.cost() + 5;
    }

}
