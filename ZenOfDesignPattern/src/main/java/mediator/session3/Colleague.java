package mediator.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 12:48
 * @description: 抽象同事类
 **/
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
