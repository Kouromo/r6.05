package movierental;

public class Movie {

    public static final int CHILDRENS = 2;

    private String title;
    private int priceCode;
    private MoviePriceCode moviePriceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public Movie(String title, MoviePriceCode moviePriceCode) {
        this.title = title;
        this.moviePriceCode = moviePriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setMoviePriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle() {
        return title;
    }

    public MoviePriceCode getMoviePriceCode() {
        return this.moviePriceCode;
    }
}
