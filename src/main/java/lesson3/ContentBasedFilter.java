package lesson3;
import org.springframework.stereotype.Component;

public abstract class ContentBasedFilter implements Filter{
    public String[] getRecommendations(String movie){
        return new String[] {"Happy Feet", "Ice age", "Shark Tale"};
    }
}
