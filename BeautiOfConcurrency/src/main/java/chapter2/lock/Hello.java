package chapter2.lock;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-02 11:23
 * @description: 可重入锁测试
 **/
public class Hello {
    public synchronized void helloA() {
        System.out.println("hello");
    }

    public synchronized void helloB() {
        System.out.println("hello B");
        helloA();
    }
}
