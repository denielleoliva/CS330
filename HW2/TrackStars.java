public class TrackStars {

    private boolean hasStar;

    public TrackStars(){
        this.hasStar=false;
    }

    public void setStar(){
        this.hasStar=true;
    }

    public boolean checkStar(){
        return this.hasStar;

    }

    public void resetStar(){
        this.hasStar=false;
    }
    
}
