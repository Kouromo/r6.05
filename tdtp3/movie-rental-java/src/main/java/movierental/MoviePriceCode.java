package movierental;
import java.util.function.Function;

public enum MoviePriceCode {
    REGULAR((daysRented) -> {
        double amount = 2;
        if (daysRented > 2)
            amount += (daysRented - 2) * 1.5;
        return amount;
    }),
    NEW_RELEASE((daysRented) -> (double) (daysRented * 3));

    private final Function<Integer, Double> computeAmount;

    MoviePriceCode(Function<Integer, Double> computeAmount) {
        this.computeAmount = computeAmount;
    }

    public Function<Integer, Double> getComputeAmount() {
        return computeAmount;
    }
}
