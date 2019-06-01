package sp.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 07:35
 * @description: 线程不安全单例
 **/
public class ThreadUnsafeSingleton {
    private static ThreadUnsafeSingleton singleton = null;

    // 限制产生多个对象
    private ThreadUnsafeSingleton() {

    }

    // 通过该方法获得实例对象
    public static ThreadUnsafeSingleton getInstance() {
        if (singleton == null) {
            singleton = new ThreadUnsafeSingleton();
        }
        return singleton;
    }
}
