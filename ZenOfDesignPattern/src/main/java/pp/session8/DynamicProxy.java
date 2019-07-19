package pp.session8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 14:47
 * @description: 动态代理类
 **/
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces,
                                         InvocationHandler h) {
        // 寻找JoinPoint连接点，AOP框架使用元数据定义
        if (true) {
            (new BeforeAdvice()).exec();
        }
        // 执行目编，并返回结果
        return (T) Proxy.newProxyInstance(loader, interfaces, h);
    }
}
