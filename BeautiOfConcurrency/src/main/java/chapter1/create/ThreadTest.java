package chapter1.create;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-23 15:30
 * @description: Thread类方式创建线程
 **/
public class ThreadTest {

    // 继承Thread类并重写run方法
    public static class MyThread extends Thread {
        @Override
        public void run() {
            System.out.println("I am a child thread");
        }
    }

    public static void main(String[] args) {
        // 创建线程
        MyThread thread = new MyThread();

        // 启动线程
        thread.start();
    }
}
