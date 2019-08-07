package strategy.session3.method1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:49
 * @description: 计算器类
 **/
public class Calculator {
    // 加符号
    private final static String ADD_SYMBOL = "+";
    // 减符号
    private final static String SUB_SYMBOL = "-";

    public int exec(int a, int b, String symbol) {
        int result = 0;
        if (symbol.equals(ADD_SYMBOL)) {
            result = this.add(a, b);
        } else if (symbol.equals(SUB_SYMBOL)) {
            result = this.sub(a, b);
        }
        return result;
    }

    private int add(int a, int b) {
        return a + b;
    }

    private int sub(int a, int b) {
        return a - b;
    }
}
