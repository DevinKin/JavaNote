package order.session3;

import order.session2.CodeGroup;
import order.session2.PageGroup;
import order.session2.RequirementGroup;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:12
 * @description: 抽象命令类
 **/
public abstract class Command {
    // 把三个组都定义好，子类可以直接使用
    protected ConcreteReceiver1 cr1;
    protected ConcreteReceiver2 cr2;
    // 只有一个方法，你要我做什么事情
    public abstract void execute();
}
