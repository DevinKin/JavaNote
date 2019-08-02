package decorate.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:49
 * @description: 排名情况修饰
 **/
public class SortDecorator extends Decorator{
    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
