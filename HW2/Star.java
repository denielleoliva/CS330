public class Star extends TreeDecorator{
    
    public Star(Tree christmasTree){
        if(this.christmasTree instanceof Star){
            System.out.println("Tree already has a Star!");
        }else{
            this.christmasTree=christmasTree;
        }
    }

    public String getDescription(){
        return christmasTree.getDescription() + " a Star";
    }

    public int cost(){
        return christmasTree.cost() + 4;
    }

}
