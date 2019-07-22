package mediator.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 12:00
 * @description: 抽象同事类
 **/
public abstract class AbstractColleague {
    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator _mediator) {
        this.mediator = _mediator;
    }
}
