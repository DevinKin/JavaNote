package chapter5;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-23 12:59
 * @description:
 **/
public class TestClass {
    private int m;
    public int inc() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }
}
