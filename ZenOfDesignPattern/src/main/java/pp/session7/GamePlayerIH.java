package pp.session7;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-18 15:43
 * @description: 动态代理类
 **/
public class GamePlayerIH implements InvocationHandler {
    // 被代理者
    Class cls = null;
    // 被代理的实例
    Object obj = null;
    // 我要代理谁
    public GamePlayerIH(Object _obj) {
        this.obj = _obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(this.obj, args);
        if (method.getName().equalsIgnoreCase("login")) {
            System.out.println("有人在用我的账号登录！");
        }
        return result;
    }
}
