import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {

    @Test
    @DisplayName("Check wrong distance")
    public void checkWrongDistance() {
        TaxiService taxi = new TaxiService();

        taxi.costCalculator(-10);
        assertEquals(0, taxi.getTotalCost());

        taxi.costCalculator(0);
        assertEquals(0, taxi.getTotalCost());
    }

    @Test
    @DisplayName("calculate cost without discount")
    public void calculateCostWithoutDiscount() {
        TaxiService taxi = new TaxiService();
        taxi.costCalculator(10);
        assertEquals(260, taxi.getTotalCost());
    }

    @Test
    @DisplayName("calculate cost with 5% discount")
    public void calculateWithBonusDiscount() {
        TaxiService taxi = new TaxiService();
        taxi.costCalculator(50);
        assertEquals(1007, taxi.getTotalCost());
    }

    @Test
    @DisplayName("calculate cost with max discount 100 rub")
    public void calculateWithMaxDiscount() {
        TaxiService taxi = new TaxiService();
        taxi.costCalculator(200);
        assertEquals(3960, taxi.getTotalCost());
    }
}
