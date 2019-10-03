import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaxiServiceTest {
    @Test
    public void shouldCostCalculator() {
        // A-A-A
        // Arrange: подготовка всего необходимого
        TaxiService taxi = new TaxiService();

        // Act: выполнение целевого действия


        // Assert: проверяем
        taxi.costCalculator(50);
        //double actual = taxi.totalCost;
        assertEquals(1007, taxi.totalCost);

        taxi.costCalculator(200);

        assertEquals(3960, taxi.totalCost);

        taxi.costCalculator(10);
        assertEquals(260, taxi.totalCost);



    }
}
