import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {
    @Test
    public void shouldCostCalculator() {

        TaxiService taxi = new TaxiService();

        taxi.costCalculator(50);
        assertEquals(1007, taxi.totalCost);

        taxi.costCalculator(200);
        assertEquals(3960, taxi.totalCost);

        taxi.costCalculator(10);
        assertEquals(260, taxi.totalCost);

    }
}
