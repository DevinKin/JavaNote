package strategy.session3.method3;

import java.util.Arrays;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 11:05
 * @description: 场景类
 **/
public class Client {
    // 加符号
    private final static String ADD_SYMBOL = "+";
    // 减符号
    private final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        // 输入的两个参数是数字
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入的参数为：" + Arrays.toString(args));
        // 上下文
        Context context = null;
        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }
        System.out.println("运行的结果为：" + a + symbol + b + "=" + context.exec(a,b, symbol));
    }
}
