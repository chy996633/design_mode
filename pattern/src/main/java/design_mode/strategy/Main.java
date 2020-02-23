package design_mode.strategy;

public class Main {

    public static void main(String[] args) {

        //简单工厂方法得到现金计算器接口

        String priceStrategy = "满300减100";
        Double originPrice = 500.0;
        CashCalculator cashCalculator = CashCalculatorFactory.get(priceStrategy);

        //通过计算器 计算 得到折扣价格
        Double price = cashCalculator.calculate(originPrice);
        System.out.println(String.format("%s 经过 %s 计算后 价格为 %s", originPrice, priceStrategy, price));
    }

}
