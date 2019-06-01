package fmp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 13:34
 * @description: 白色人种创建工厂
 **/
public class WhiteHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new WhiteHuman();
    }
}
