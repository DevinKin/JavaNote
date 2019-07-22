package order.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:04
 * @description: 调用类
 **/
public class Invoker {
    // 什么命令
    private Command command;
    // 客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }
    // 执行客户的命令
    public void action() {
        this.command.execute();
    }
}
