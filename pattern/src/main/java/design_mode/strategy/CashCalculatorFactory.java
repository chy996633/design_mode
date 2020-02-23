package design_mode.strategy;

public class CashCalculatorFactory {


    public static CashCalculator get(String priceStrategy) {
        CashCalculator calculator;
        switch (priceStrategy) {
            case "打五折" :
                calculator = new RebateCashCalculator(0.5);
                break;
            case "满300减100" :
                calculator = new ManJianCashCalculator(300, 100);
                break;
            default:
                calculator = new NormalCashCalculator();
        }
        return calculator;
    }
}
