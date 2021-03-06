package strategy.session3.method4;

import java.util.Arrays;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 11:33
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        System.out.println("运行的结果为：" + a + symbol + b + "=" + Calculator.ADD.exec(a,b));
    }
}
