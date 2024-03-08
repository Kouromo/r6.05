import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    private Car car;

    @BeforeEach
    public void setUp() {
        car = new Car("Sedan", "Bleu");
    }

    @Test
    public void testAccelerer() {
        car.accelerate();
        assertThat(car.getSpeed()).isEqualTo(10);
    }

    @Test
    public void testRalentir() {
        car.accelerate();
        car.slowing();
        assertThat(car.getSpeed()).isEqualTo(0);
    }
}
