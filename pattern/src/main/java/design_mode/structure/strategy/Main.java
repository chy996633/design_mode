package design_mode.structure.strategy;

public class Main {

    public static void main(String[] args) {

        //通过把 锦囊 传递给 策略选择器，来选择策略执行
        String priceStrategy = "满300减100";
        Double originPrice = 500.0;
        CashContext cashContext = new CashContext(priceStrategy);
        Double price = cashContext.getResult(originPrice);

        System.out.println(String.format("%s 经过 %s 计算后 价格为 %s", originPrice, priceStrategy, price));
    }

}
