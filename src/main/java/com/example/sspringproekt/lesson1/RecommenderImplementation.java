package com.example.sspringproekt.lesson1;

import lesson2.CollaborativeFilter;
import lesson2.Filter;

public class RecommenderImplementation {
    public RecommenderImplementation(Filter filter) {
    }

    public String[] recommendMovies (String movie) {
        CollaborativeFilter filter = new CollaborativeFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }

}
