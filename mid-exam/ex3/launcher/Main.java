package ex3.launcher;

import java.io.IOException;

import java.util.List;
import java.util.Collections;

import ex3.datamodel.Movie;
import ex3.service.MovieService;

import java.util.Comparator;


public class Main {
    
    public static void main(String[] args) {
        
        MovieService movieService = new MovieService();

        try {
            List<Movie> movies =  movieService.readMovies();

            Collections.sort(movies, Comparator.comparing(Movie::getRating));

            System.out.println("Movies sorted by rating: ");
            MovieService.showMovies(movies);
            

            System.out.println();
            System.out.println("Available movies: ");
            List<Movie> availableMovies = movieService.getAvailableMovies(movies);
            MovieService.showMovies(availableMovies);

            System.out.println();
            System.out.println("Updating House Full: ");
            List<Movie> updatedMovies =  movieService.updateHouseFull(movies);
            MovieService.showMovies(updatedMovies);


        }catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }
}
