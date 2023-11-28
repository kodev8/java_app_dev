package ex3.datamodel;

public class Movie {

    public String movieId;
    public String movieTitle;
    public float rating;
    public String availability;
    public double price;
    public String time;

    public String getMovieId() {
        return movieId;
    }
    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }
    public String getMovieTitle() {
        return movieTitle;
    }
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }
    public float getRating() {
        return rating;
    }
    public void setRating(float rating) {
        this.rating = rating;
    }
    public String getAvailability() {
        return availability;
    }
    public void setAvailability(String availability) {
        this.availability = availability;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }


    @Override
    public String toString() {
        return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + ", availability=" + availability
                + ", price=" + price + ", rating=" + rating + ", time=" + time + "]";
    }
    
    
}
