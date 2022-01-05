public class BonusMilesService {
    public int calculate(int price) {
        byte amountCurrency = 20;
        int bonus_Miles = price / amountCurrency;
        return bonus_Miles;
    }
}
