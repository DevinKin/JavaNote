package order.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 16:16
 * @description: 执行增加一项需求的命令
 **/
public class AddRequirementCommand extends Command{
    // 执行增加一项需求的命令
    @Override
    public void execute() {
        // 找到需求组
        super.rg.find();

        super.rg.add();

        super.rg.plan();
    }
}
