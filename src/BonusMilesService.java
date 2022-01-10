public class BonusMilesService {
    public int calculate(int price) {
        byte amountCurrency = 20;
        int bonusMiles = price / amountCurrency;
        return bonusMiles;
    }
}
