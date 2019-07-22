package mediator.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 11:39
 * @description: 抽象中介者类
 **/
public abstract class AbstractMediator {
    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    // 构造函数
    public AbstractMediator() {
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    // 中介者最重要的方法叫做时间方法，处理多个对象之间的关系
    public abstract void execute(String str, Object ... objects);
}
