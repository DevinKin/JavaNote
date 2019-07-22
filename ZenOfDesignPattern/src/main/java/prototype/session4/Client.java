package prototype.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:03
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
    }
}
