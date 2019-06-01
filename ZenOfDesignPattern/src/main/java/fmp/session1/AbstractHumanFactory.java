package fmp.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 11:56
 * @description: 抽象人类创建工厂
 **/
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
