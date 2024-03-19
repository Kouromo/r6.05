package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private Movie movie;
    private int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public int getDaysRented() {
        return daysRented;
    }

    public Movie getMovie() {
        return movie;
    }

    double determineAmounts() {
        switch (getMovie().getPriceCode()) {
            case Movie.CHILDRENS:
                double thisAmount = 1.5;
                if (getDaysRented() > 3)
                    thisAmount += (getDaysRented() - 3) * 1.5;
                return thisAmount;
        }
        if(getMovie().getMoviePriceCode() == MoviePriceCode.REGULAR)
            getMovie().getMoviePriceCode().getComputeAmount().apply(getDaysRented());
        return 0;
    }

    int addBonusForATwoDaysNewReleaseRental() {
        if ((getMovie().getPriceCode() == MoviePriceCode.NEW_RELEASE) && getDaysRented() > 1)
            return 1;
        return 0;
    }

    int frequentRenterPoints() {
        return 1 + addBonusForATwoDaysNewReleaseRental();
    }
}
