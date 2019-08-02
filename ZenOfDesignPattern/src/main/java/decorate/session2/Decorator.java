package decorate.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:43
 * @description: 修饰的抽象类
 **/
public abstract class Decorator extends SchoolReport{
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
