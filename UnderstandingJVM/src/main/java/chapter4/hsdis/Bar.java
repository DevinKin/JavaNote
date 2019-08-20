package chapter4.hsdis;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-20 09:44
 * @description:
 **/
public class Bar {
    int a = 1;
    static int b = 2;

    public int sum(int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        new Bar().sum(3);
    }
}
