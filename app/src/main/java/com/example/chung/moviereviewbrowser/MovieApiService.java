package com.example.chung.moviereviewbrowser;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by chung on 7/20/16.
 */

public interface MovieApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
}
