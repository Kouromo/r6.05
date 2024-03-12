import java.time.LocalDate;

public class DateUtils {
    public static boolean isNowBetween(LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(LocalDate.now(), startingDate, endingDate, );
    }

    public static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate, boolean inclusive) {
        // code à modifier pour tenir compte du paramètre inclusive

        return (date.isAfter(startingDate)
                &&
                date.isBefore(endingDate)
        );
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return (!isDateBetween(date, startingDate, endingDate, ));
    }
}