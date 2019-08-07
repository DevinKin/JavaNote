package strategy.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-06 17:50
 * @description: 孙夫人断后
 **/
public class BlockEnemy implements IStrategy{

    public void operate() {
        System.out.println("孙夫人断后，挡住追兵");
    }
}
