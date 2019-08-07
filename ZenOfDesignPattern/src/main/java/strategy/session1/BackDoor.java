package strategy.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-06 17:47
 * @description: 乔国老开后门
 **/
public class BackDoor implements IStrategy{
    @Override
    public void operate() {
        System.out.println("找乔国帮忙，让吴国给孙权施加压力");
    }
}
