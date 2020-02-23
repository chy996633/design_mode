package design_mode.structure.strategy;

public class RebateCashCalculator implements CashCalculator {

    private Double rebate = 1.0;

    public RebateCashCalculator(double rebate) {
        this.rebate = rebate;
    }

    public Double calculate(Double originPrice) {
        return originPrice * rebate;
    }
}
