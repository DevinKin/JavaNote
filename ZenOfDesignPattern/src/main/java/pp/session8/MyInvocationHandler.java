package pp.session8;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 14:46
 * @description: 动态代理的Handler类
 **/
public class MyInvocationHandler implements InvocationHandler {
    // 被代理的对象
    private Object target = null;

    // 通过构造函数传递一个对象
    public MyInvocationHandler(Object _object) {
        this.target = _object;
    }

    // 代理方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行被代理的方法
        return method.invoke(this.target, args);
    }
}
