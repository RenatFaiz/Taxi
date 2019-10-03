import java.util.Scanner;

public class TaxiService {

    int seatCost = 60;
    int priceForKm = 20;
    int bonus = 5;
    double totalCost;
    int maxDiscount = 100;
    int orderOnThousand = 1000;

    void costCalculator(int distance) {

        System.out.println("Добро пожаловать в службу заказа такси!\n" +
                "Сколько километров Вам нужно проехать?");
        Scanner in = new Scanner(System.in);
        //distance = in.nextInt();
        double costTravel = distance * priceForKm + seatCost;
        double discountAmount = (costTravel / 100) * bonus;

        if (costTravel < orderOnThousand) {
            totalCost = costTravel;
        } else if (costTravel > orderOnThousand && discountAmount <= maxDiscount) {
            totalCost = costTravel - discountAmount;
        } else {
            totalCost = costTravel - maxDiscount;
        }
        System.out.println("Стоимость поездки будет равна: " + (int) totalCost + " руб.");
    }

}
