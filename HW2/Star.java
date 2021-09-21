

public class Star extends TreeDecorator{
    int cost = 0;
    String description = "";

    public Star(Tree christmasTree){
        this.christmasTree = christmasTree;
        if(starState.checkStar()){
            System.out.println("Tree already has a star!");
            cost = 0;
            description = "";

        }else{
            starState.setStar();
            cost = 4;
            description = "a Star";
        }
    }

    public String getDescription(){
        return christmasTree.getDescription() + description;
    }

    public int cost(){
        return christmasTree.cost() + cost;
    }


}
