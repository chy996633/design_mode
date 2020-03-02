package design_mode.structure.strategy;

public class ManJianDaZheStrategy implements DaZheStrategy {

    private int man;
    private int jian;

    public ManJianDaZheStrategy(int man, int jian) {
        this.man = man;
        this.jian = jian;
    }

    public Double dazhe(Double originPrice) {
        if (originPrice > man) {
            return originPrice - jian;
        }
        return originPrice;
    }
}
