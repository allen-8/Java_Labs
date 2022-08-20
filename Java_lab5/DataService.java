package L5.Animals;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import java.util.List;

public interface DataService
{
    @GET("/animals/rand")
    Call<Animal> getAnimal();

    @GET("/animals/rand/{number}")
    Call<List<Animal>> getAnimals(@Path("number")int number);
}
