public class Leds extends TreeDecorator{
    
    public Leds(Tree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , LEDs";
    }

    public int cost(){
        return christmasTree.cost() + 10;
    }

}
