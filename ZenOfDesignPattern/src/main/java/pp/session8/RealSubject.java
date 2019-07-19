package pp.session8;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 11:00
 * @description: 真实主题类
 **/
public class RealSubject implements Subject{
    // 业务操作
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }
}
