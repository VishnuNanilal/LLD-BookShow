import java.util.List;

public class ShowType
{
    String name;
    Worker director;
    Worker producer;
    List<Cast> cast;
    int ratingSum;
    int ratingCount;
    float avgRating;
    int maxRating=BookShowApplication.maxRating;

    public String toString(){
        return "TODO toString for ShowType";
    }

    public boolean addRating(int newRating){
        if(newRating>maxRating)
            return false;

        ratingSum+=newRating;
        ratingCount++;
        avgRating=(float)ratingSum/ratingCount;

        return true;
    }
    public float getRating(){
        return avgRating;
    }
}
