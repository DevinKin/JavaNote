package strategy.session3.method2;

import strategy.session3.method1.Calculator;

import java.util.Arrays;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:53
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];        // 符号
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        Calculator cal = new Calculator();
        System.out.println("运行的结果为：" + a + symbol + b + "=" + cal.exec(a,b, symbol));
    }
}
