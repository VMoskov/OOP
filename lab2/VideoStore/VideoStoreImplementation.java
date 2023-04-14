import java.util.Random;

public class VideoStoreImplementation implements VideoStore{
    private float[] cost;
    private String[] movies;

    private static int counter = 0;

    public VideoStoreImplementation(){
        cost = new float[100];
        movies = new String[100];
    }

    @Override
    public void add(String id){
        movies[counter] = id;
        Random random = new Random();
        cost[counter] = random.nextFloat() * 20;
        counter++;
    }

    @Override
    public void remove(String id){
        for(int i = 0; i < counter; i++){
            if(movies[i].equals(id)){
                //remove movie from array
                for(int j = i; j < counter; j++){
                    movies[j] = movies[j+1];
                    cost[j] = cost[j+1];
                }
                counter--;
            }
        }
    }

    @Override
    public float getCost(){
        float cost = 0;
        for(int i = 0; i < counter; i++){
            cost += this.cost[i];
        }
        return cost;
    }
}
