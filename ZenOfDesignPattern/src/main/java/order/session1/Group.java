package order.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 15:37
 * @description: 抽象组
 **/
public abstract class Group {
    // 甲乙双反分开办公，如果你要和某个组讨论，你首先要找到这个组
    public abstract void find();

    // 被要求增加功能
    public abstract void add();

    // 被要求删除功能
    public abstract void delete();

    // 要求被修改功能
    public abstract void change();

    // 被要求给出所有的变更计划
    public abstract void plan();
}
