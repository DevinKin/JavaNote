package fmp.session4;


/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 13:32
 * @description: 黑色人种创建工厂
 **/
public class BlackHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new BlackHuman();
    }
}
