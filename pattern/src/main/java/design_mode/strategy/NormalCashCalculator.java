package design_mode.strategy;

public class NormalCashCalculator implements CashCalculator {
    public Double calculate(Double originPrice) {
        return originPrice;
    }
}
