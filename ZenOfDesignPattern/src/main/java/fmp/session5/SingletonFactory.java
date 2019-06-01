package fmp.session5;

import java.lang.reflect.Constructor;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 13:40
 * @description: 单例工厂类
 **/
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class cl = Class.forName(Singleton.class.getName());
            // 获得无参构造器
            Constructor constructor = cl.getDeclaredConstructor();
            // 产生一个实例对象
            singleton = (Singleton) constructor.newInstance();
        } catch (Exception e) {
            //异常处理
        }
    }

    public static Singleton getSingleton() {
        return singleton;
    }
}
