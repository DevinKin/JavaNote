package chapter1.threadlocal;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-31 16:34
 * @description: 测试ThreadLocal不支持继承性
 **/
public class TestThreadLocal {
//    public static ThreadLocal<String> threadLocal = new ThreadLocal<>();
    public static ThreadLocal<String> threadLocal = new InheritableThreadLocal<>();

    public static void main(String[] args) {
        threadLocal.set("hello world");
        Thread thread = new Thread(() -> {
            System.out.println("thread: " + threadLocal.get());
        });
        thread.start();
        System.out.println("main: " + threadLocal.get());
    }
}
