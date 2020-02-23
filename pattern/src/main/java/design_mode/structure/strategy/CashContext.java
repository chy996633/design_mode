package design_mode.structure.strategy;

public class CashContext {

    CashCalculator calculator;

    public CashContext(String priceStrategy) {
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
    }

    public Double getResult(Double originPrice) {
        return calculator.calculate(originPrice);
    }
}
