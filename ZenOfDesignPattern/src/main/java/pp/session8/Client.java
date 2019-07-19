package pp.session8;

import java.lang.reflect.InvocationHandler;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 15:03
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 定义一个主题
        Subject subject = new RealSubject();
        // 定义一个Handler
        InvocationHandler handler  = new MyInvocationHandler(subject);
        // 定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),
                subject.getClass().getInterfaces(), handler);
        // 代理的行为
        proxy.doSomething("Finish");

        Subject subject1 = new RealSubject();
        Subject proxy1 = SubjectDynamicProxy.newProxyInstance(subject);
        proxy1.doSomething("Finish");
    }
}
