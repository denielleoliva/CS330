public abstract class Order{

    protected String name;
    protected int burgers, shakes;

    public void addBurger(){
        burgers++;
    }

    public void addShake(){
        shakes++;
    }

    public String getName(){
        return name;
    }

    public int getBurgers(){
        return burgers;
    }

    public int getShakes(){
        return shakes;
    }

}