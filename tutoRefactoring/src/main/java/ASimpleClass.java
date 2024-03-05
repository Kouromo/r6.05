import java.time.LocalDate;

public class ASimpleClass {

    public ASimpleClass() {
    }

    /**
     * Additionne a et b
     * @param a - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int add(int a, int b) {
        return a + b ;
    }

    public static void main(String[] args) {
        new ASimpleClass().add(1,2);

        System.out.println("Hello world");
        if (DateUtils.isDateBetween(LocalDate.now(), LocalDate.of(2024, 1, 1), LocalDate.of(2024, 12, 31), true )) {
            System.out.println("oui");
        }
        else
        {
            System.out.println("non");
        }
    }

}


