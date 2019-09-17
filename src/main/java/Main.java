public class Main {
    public static void main(String[] args) {
        int totalCost = 100000;
        int presentCost = 2000;
        int amountForBonuses = 1000;
        int bonus = 0;

        int coefficientOfBonuses = presentCost / amountForBonuses;

        if (totalCost <= 15000) {
            bonus = 50 * coefficientOfBonuses;
        }
        if (totalCost > 15000 && totalCost <= 150000) {
            bonus = 70 * coefficientOfBonuses;
        }
        if (totalCost > 150000) {
            bonus = 100 * coefficientOfBonuses;
        }

        System.out.println(bonus);

    }

}
