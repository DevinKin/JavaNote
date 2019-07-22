package order.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:21
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 定义我们的接头人
        Invoker xiaoSan = new Invoker();
        // 客户增加一项需求
//        Command command = new AddRequirementCommand();
        Command command = new DeletePageCommand();
        xiaoSan.setCommand(command);
        xiaoSan.action();
    }
}
