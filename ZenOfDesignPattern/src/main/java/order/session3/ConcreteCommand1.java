package order.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:40
 * @description: 具体的Command类
 **/
public class ConcreteCommand1 extends Command{
    // 对哪个Receiver类进行命令处理
    private Receiver receiver;

    // 构造函数传递接收者
    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 业务处理
        this.receiver.doSomething();
    }
}
