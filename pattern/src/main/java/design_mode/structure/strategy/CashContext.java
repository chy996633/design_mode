package design_mode.structure.strategy;

public class CashContext {

    DaZheStrategy calculator;

    public CashContext(String priceStrategy) {
        switch (priceStrategy) {
            case "打五折" :
                calculator = new RebateDaZheStrategy(0.5);
                break;
            case "满300减100" :
                calculator = new ManJianDaZheStrategy(300, 100);
                break;
            default:
                calculator = new NormalDaZheStrategy();
        }
    }

    public Double getResult(Double originPrice) {
        return calculator.dazhe(originPrice);
    }
}
