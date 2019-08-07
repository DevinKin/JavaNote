package strategy.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-06 17:49
 * @description: 吴国太开绿灯
 **/
public class GivenGreenLight implements IStrategy{

    public void operate() {
        System.out.println("求吴国太开绿灯，放行！");
    }
}
