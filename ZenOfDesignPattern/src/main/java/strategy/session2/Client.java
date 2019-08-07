package strategy.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:41
 * @description: 高层模块
 **/
public class Client {
    public static void main(String[] args) {
        // 声明一个具体的策略
        Strategy strategy = new ConcreteStrategy1();
        // 声明对应的上下文
        Context context = new Context(strategy);
        // 执行封装后的方法
        context.doAnything();
    }
}
