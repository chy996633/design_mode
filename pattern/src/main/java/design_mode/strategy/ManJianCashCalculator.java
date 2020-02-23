package design_mode.strategy;

public class ManJianCashCalculator implements CashCalculator {

    private int man;
    private int jian;

    public ManJianCashCalculator(int man, int jian) {
        this.man = man;
        this.jian = jian;
    }

    public Double calculate(Double originPrice) {
        if (originPrice > man) {
            return originPrice - jian;
        }
        return originPrice;
    }
}
