package sp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-05-29 15:34
 * @description: 单例模式通用代码
 **/
public class Singleton {
    private static final Singleton singleton = new Singleton();

    // 限制产生多个对象
    private Singleton() {

    }

    // 通过该方法获得实例对象
    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {

    }
}
