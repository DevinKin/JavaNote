package chapter1.interrupt;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-31 11:24
 * @description: 线程睡眠中断测试类
 **/
public class SleepInterruptTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                for (;;) {

                }
            }
        });

        // 启动线程
        threadOne.start();

        // 设置中断标志
        threadOne.interrupt();

        // 获取threadOne中断标志并重置
        System.out.println("isInterrupted: " + threadOne.isInterrupted());

        // 获取当前线程(mainThread)中断标志并重置
        System.out.println("isInterrupted: " + threadOne.interrupted());

        // 获取当前线程(mainThread)中断标志并重置
        System.out.println("isInterrupted: " + Thread.interrupted());

        // 获取threadOne中断标志
        System.out.println("isInterrupted: " + threadOne.isInterrupted());

        threadOne.join();
        System.out.println("main thread is over");
    }
}
