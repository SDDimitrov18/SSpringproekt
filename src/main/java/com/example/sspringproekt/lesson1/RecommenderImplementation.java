package com.example.sspringproekt.lesson1;

import lesson2.CollaborativeFilter;
import lesson2.Filter;

public class RecommenderImplementation {
   /* public String[] recommendMovies (String movie) {
        CollaborativeFilter filter = new CollaborativeFilter();
        String[] results = filter.getRecommendations("Finding Dory");
        return results;
    }
    */
    private Filter filter;
    public RecommenderImplementation(Filter filter){
        super();
        this.filter = filter;
    }
    public String [] recommendMovies (String movie) {
        System.out.println("None of the filter in use " + filter + "\n");
        String[] results = filter.getRecommendation("Finding Dory");
        return results;
    }

}
