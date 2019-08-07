package strategy.session3.method2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:57
 * @description: 计算器类
 **/
public class Calculator {
    // 加符号
    private final static String ADD_SYMBOL = "+";
    // 减符号
    private final static String SUB_SYMBOL = "-";
    public int exec(int a, int b, String symbol) {
        return symbol.equals(ADD_SYMBOL) ? a + b : a - b;
    }
}
