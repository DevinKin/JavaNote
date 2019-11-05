package chapter7;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-10-31 16:59
 * @description: 被动引用的例子之一
 **/
public class SuperClass {
    static {
        System.out.println("SuperClass init!");
    }
    public static int value = 123;
}
