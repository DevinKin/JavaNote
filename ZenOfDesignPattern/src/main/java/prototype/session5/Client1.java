package prototype.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:15
 * @description: 浅拷贝测试类
 **/
public class Client1 {
    public static void main(String[] args) {
        // 产生一个对象
        Thing thing = new Thing();
        // 设置一个值
        thing.setValue("张三");
        // 拷贝一个对象
        Thing cloneThing = thing.clone();
        cloneThing.setValue("李四");
        System.out.println(thing.getValue());
    }
}
