public class TaxiService {

    private int seatCost = 60;
    private int priceForKm = 20;
    private int bonus = 5;
    private double totalCost;
    private int maxDiscount = 100;
    private int orderOnThousand = 1000;
    private double wrongDistance = 0.0;


    public double costCalculator(int distance) {

        double costTravel = distance * priceForKm + seatCost;
        double discountAmount = (costTravel / 100) * bonus;

        if (distance <= 0) {
            return totalCost = wrongDistance;
        }
        if (costTravel < orderOnThousand) {
            return totalCost = costTravel;
        }
        if (costTravel > orderOnThousand && discountAmount <= maxDiscount) {
            return totalCost = costTravel - discountAmount;
        }
        if (costTravel > orderOnThousand && discountAmount > maxDiscount) {
            totalCost = costTravel - maxDiscount;
        }
        return totalCost;
    }

    public double getTotalCost() {
        return (int) totalCost;
    }
}
