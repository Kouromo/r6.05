import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
    }

    @Test
    public void testEstAdulte() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void testDemarrerVoiture() {
        Car car = new Car("Sedan", "Bleu");
        car.startCar(driver);
        // How to assert that the demarrerVoiture method was called?
    }

    @Test
    public void testArreterVoiture() {
        Car car = new Car("Sedan", "Bleu");
        car.stopCar(driver);
        // How to assert that the arreterVoiture method was called?
    }

    @Test
    public void testChangerVitesse() {
        Car car = new Car("Sedan", "Bleu");

        car.changeSpeed(80, driver);
        assertThat(car.getSpeed()).isEqualTo(80);
    }
}
