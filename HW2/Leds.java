public class Leds extends ChristmasTreeDecorator{
    
    public Leds(ChristmasTree christmasTree){
        this.christmasTree=christmasTree;
    }

    public String getDescription(){
        return christmasTree.getDescription() + " , LEDs";
    }

    public int cost(){
        return christmasTree.cost() + 10;
    }

}
