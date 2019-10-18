import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {

    @Test
    @DisplayName("Check wrong distance")
    public void checkWrongDistance() {
        TaxiService taxi = new TaxiService();
        assertEquals(0, taxi.costCalculator(-10));
        assertEquals(0, taxi.costCalculator(0));
    }

    @Test
    @DisplayName("calculate cost without discount")
    public void calculateCostWithoutDiscount() {
        TaxiService taxi = new TaxiService();
        assertEquals(260, taxi.costCalculator(10));
    }

    @Test
    @DisplayName("calculate cost with 5% discount")
    public void calculateWithBonusDiscount() {
        TaxiService taxi = new TaxiService();
        assertEquals(1007, taxi.costCalculator(50));
    }

    @Test
    @DisplayName("calculate cost with max discount 100 rub")
    public void calculateWithMaxDiscount() {
        TaxiService taxi = new TaxiService();
        assertEquals(3960, taxi.costCalculator(200));
    }
}
