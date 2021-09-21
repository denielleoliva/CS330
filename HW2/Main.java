

public class Main{

    public static void printtree(Tree mytree){

        System.out.println(mytree.getDescription()+ " costs $" + mytree.cost() + ".");
    }

    public static void main(String[] args){

        Tree mytree = new ColoradoBlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);

        printtree(mytree);

    }


}


