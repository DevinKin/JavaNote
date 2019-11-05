package chapter7;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-10-31 17:12
 * @description: 常量
 **/
public class ConstClass {
    static {
        System.out.println("ConstClass init!");
    }
    public static final String HELLOWORLD = "hello world";
}
