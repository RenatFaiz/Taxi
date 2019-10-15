import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {
    @Test
    public void shouldCalculateCost() {

        TaxiService taxi = new TaxiService();

        taxi.costCalculator(-10);
        assertEquals(0, taxi.getTotalCost());

        taxi.costCalculator(0);
        assertEquals(0, taxi.getTotalCost());

        taxi.costCalculator(10);
        assertEquals(260, taxi.getTotalCost());

        taxi.costCalculator(50);
        assertEquals(1007, taxi.getTotalCost());

        taxi.costCalculator(200);
        assertEquals(3960, taxi.getTotalCost());

    }
}
