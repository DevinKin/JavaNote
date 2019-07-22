package mediator.session1;

import java.util.Random;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 11:03
 * @description: 销售类
 **/
public class Sale {
    // 销售IBM电脑
    public void sellIBMComputer(int number) {
        // 访问库存
        Stock stock = new Stock();
        // 访问采购
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) { // 库存数量不够销售
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");
        stock.decrease(number);
    }

    // 反馈销售情况，0~100之间变化，0代表根本没人卖，100表示非常畅销，出一个卖一个
    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为：" + saleStatus);
        return saleStatus;
    }

    // 折价处理
    public void offSale() {
        // 库房有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");
    }
}
