package chapter2.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-09 10:22
 * @description: 借助CGLib使方法区出现内存溢出异常
 * VM Args(JDK7): -XX:PermSize=10M -XX:MaxPermSize=10M
 * VM Args(JDK8): -XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=10M
 **/
public class JavaMethodAreaOOM {
    public static void main(String[] args) {
        while (true) {
            Enhancer enhancer = new Enhancer();
            enhancer.setSuperclass(OOMObject.class);
            enhancer.setUseCache(false);
            enhancer.setCallback(new MethodInterceptor() {
                @Override
                public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                    return methodProxy.invoke(o, args);
                }
            });
            enhancer.create();
        }
    }

    static class OOMObject {

    }
}
