package design_mode.structure.strategy;

public class RebateDaZheStrategy implements DaZheStrategy {

    private Double rebate = 1.0;

    public RebateDaZheStrategy(double rebate) {
        this.rebate = rebate;
    }

    public Double dazhe(Double originPrice) {
        return originPrice * rebate;
    }
}
