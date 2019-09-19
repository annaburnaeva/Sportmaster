public class Main {
    public static void main(String[] args) {
        int totalCost = 100000;
        int presentCost = 2000;
        int amountForBonuses = 1000;
        int bonus = 0;

        int bonusesForStandart = 50;
        int bonusesForSilver = 70;
        int bonusesForGold = 100;

        int standartTotalCost = 15000;
        int goldTotalCost = 150000;


        int coefficientOfBonuses = presentCost / amountForBonuses;

        if (totalCost <= standartTotalCost) {
            bonus = bonusesForStandart * coefficientOfBonuses;
        }
        if (totalCost > standartTotalCost && totalCost <= goldTotalCost) {
            bonus = bonusesForSilver * coefficientOfBonuses;
        }
        if (totalCost > goldTotalCost) {
            bonus = bonusesForGold * coefficientOfBonuses;
        }

        System.out.println(bonus);
    }

}
