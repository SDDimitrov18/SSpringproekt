package lesson2;

import com.example.sspringproekt.lesson1.RecommenderImplementation;

public class CollaborativeFilter {

    public String[] getRecommendations(String movie){
        RecommenderImplementation recommender = new RecommenderImplementation((Filter) new CollaborativeFilter());
        return new String[2];
    }
}
