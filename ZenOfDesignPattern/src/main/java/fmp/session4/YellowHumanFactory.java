package fmp.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 13:35
 * @description: 黄色人种创建工厂
 **/
public class YellowHumanFactory extends AbstractHumanFactory{
    @Override
    public Human createHuman() {
        return new YellowHuman();
    }
}
