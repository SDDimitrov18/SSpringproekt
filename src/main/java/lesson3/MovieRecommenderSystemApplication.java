package lesson3;

import com.example.sspringproekt.lesson1.RecommenderImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(MovieRecommenderSystemApplication.class,args);

        RecommenderImplementation recommender = appContext.getBean(RecommenderImplementation.class);

        String[] result = recommender.recommendMovies("Finding Dory");

        System.out.println(Arrays.toString(result));
    }
}
