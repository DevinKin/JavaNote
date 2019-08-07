package strategy.session3.method3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 11:01
 * @description: 上下文
 **/
public class Context {
    private Calculator cal = null;

    public Context(Calculator cal) {
        this.cal = cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }
}
