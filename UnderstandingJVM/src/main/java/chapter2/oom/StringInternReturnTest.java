package chapter2.oom;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-09 10:11
 * @description: String.intern()返回引用的测试
 **/
public class StringInternReturnTest {
    public static void main(String[] args) {
        String str1 = new StringBuilder("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
