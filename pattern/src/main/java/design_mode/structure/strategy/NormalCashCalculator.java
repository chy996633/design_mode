package design_mode.structure.strategy;

public class NormalCashCalculator implements CashCalculator {
    public Double calculate(Double originPrice) {
        return originPrice;
    }
}
