package pp.session8;

import java.lang.reflect.InvocationHandler;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 15:22
 * @description: 具体业务的动态代理
 **/
public class SubjectDynamicProxy extends DynamicProxy {
    public static <T> T newProxyInstance(Subject subject) {
        // 获得ClassLoader
        ClassLoader loader = subject.getClass().getClassLoader();
        // 获得接口数组
        Class<?>[] classes = subject.getClass().getInterfaces();
        // 获得handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        return newProxyInstance(loader, classes, handler);
    }
}
