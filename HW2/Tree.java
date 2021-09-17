public abstract class Tree {
    String description = "unknown Christmas Tree";

    public void printtree(Tree mytree){

        System.out.println(this.getDescription()+ "costs $" + this.cost() + ".");
    }

    public String getDescription(){
        return description;
    }

    public abstract int cost();
}
