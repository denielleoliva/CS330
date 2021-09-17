

public class Main{

    public static void main(String[] args){

        Tree mytree = new ColoradoBlueSpruce();
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);
        mytree = new Star(mytree);
        mytree = new Ruffles(mytree);

        System.out.println(mytree.getDescription()+ "costs $" + mytree.cost() + ".");

    }

        

}



// class Main {

//     public static void main(String[] args) {
  
      
//       Cocktail old_fashioned = new Bourbon();
//       old_fashioned = new Bitters(old_fashioned);
//       old_fashioned = new Bitters(old_fashioned);
//       old_fashioned = new Cherry(old_fashioned);
//       old_fashioned = new Lime(old_fashioned);
  
//       System.out.println("Drink Description: " + old_fashioned.getDescription() + ". Calories: " + old_fashioned.calorie_value());
  
//     }
  
//   }