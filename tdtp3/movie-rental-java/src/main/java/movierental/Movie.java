package movierental;
import MoviePriceCode;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;

    private String title;
    private MoviePriceCode priceCode;

    public Movie(String title, MoviePriceCode moviePriceCode) {
        this.title = title;
        this.priceCode = moviePriceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }
    public String getTitle() {
        return title;
    }


}
