package strategy.session3.method3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 11:00
 * @description: 减法运算
 **/
public class Sub implements Calculator{
    // 减法运算
    @Override
    public int exec(int a, int b) {
        return a-b;
    }
}
