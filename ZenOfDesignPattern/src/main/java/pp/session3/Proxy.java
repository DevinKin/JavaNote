package pp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-07 16:51
 * @description: 代理类
 **/
public class Proxy implements Subject{
    // 要代理哪个实现类
    private Subject subject = null;

    // 默认被代理者
    public Proxy() {
        this.subject = new Proxy();
    }

    // 通过构造函数传递代理者
    public Proxy(Object ...objects) {

    }

    @Override
    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    // 预处理
    public void before() {
        // do something
    }

    // 善后处理
    public void after() {
        // do something
    }
}
