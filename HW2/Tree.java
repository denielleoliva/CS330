

public abstract class Tree {
    String description = "unknown Christmas Tree";

    final static TrackStars starState = new TrackStars();
    

    public String getDescription(){
        return description;
    }

    public abstract int cost();
}
