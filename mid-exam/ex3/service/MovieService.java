package ex3.service;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import ex3.datamodel.Movie;

public class MovieService {

    public List<Movie> readMovies() throws IOException {

        // set the path for the movies csv file
        String path = "C:\\Users\\kalev\\Downloads\\movie.csv";

        // create a new file reader and buffered reader for the csv file
        FileReader fileReader = new FileReader(path);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        
        // set a count variable to keep track of the current line to check if it is the header row
        int count = 0;

        // create a string variable to store the current line of the buffered reader
        String line;

        // create array list to store the movies
        ArrayList<Movie> movies = new ArrayList<>();

        // csv format: 0: movieI, 1: movie_nam, 2: rating, 3: availability, 4: price, 5: timing
        while ((line = bufferedReader.readLine()) != null) {

            // skip the first row of headers and continue to the next line
            if (count == 0) {
                count++;
                continue;
            }

            // split the csv row data by comma
            String[] movieData = line.split(",");

            // create a new movie object and set the movie data
            Movie movie = new Movie();
            

            movie.setMovieId(movieData[0].trim());
            movie.setMovieTitle(movieData[1].trim());

            String rating = movieData[2].trim();

            // check if rating is 0, null , or empty string and set the rating to 0
            if (rating.equals("0") || rating.equals("null") || rating.equals("")) {
                movie.setRating(0);
            }
            else {
                movie.setRating(Float.parseFloat(rating));
            }
           
            movie.setAvailability(movieData[3].trim());
            movie.setPrice(Double.parseDouble(movieData[4].trim()));
            movie.setTime(movieData[5].trim());

            
            // add the movie to the movies list
            movies.add(movie);
        }

        bufferedReader.close();

        return movies;
    }

    public List<Movie> getAvailableMovies (List<Movie> movies) {


        List<Movie> filteredMovies = new ArrayList<>();

        // loop through the movies list
        for (Movie movie : movies) {

            // if the movie availability matches is avaliable add it to the filtered movies list
            if (movie.getAvailability().toLowerCase().equals("available")) {
                filteredMovies.add(movie);
            }
        }

        return filteredMovies;
    }

     public List<Movie> updateHouseFull (List<Movie> movies) {


        // loop through the movies list
        for (Movie movie : movies) {

            // if the movie is not available and rating is ge 4.5 add update the availability to house full
            if (movie.getAvailability().toLowerCase().equals("not available") && movie.getRating() >= 4.5) {
                movie.setAvailability("House Full");
            }
            
        }

        return movies;
    }

    public static void showMovies(List<Movie> movies) {

        // loop through the movies list and print each movie
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }


}
