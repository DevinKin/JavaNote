package chapter7;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-10-31 17:02
 * @description: 非主动使用类字段
 **/
public class NotInitialization {
    static {
        System.out.println("NoInitialization init!");
    }
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
