package chapter1.interrupt;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-31 11:38
 * @description: 线程睡眠中断测试类
 **/
public class SleepInterruptTest3 {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                // 中断标志位为true时会退出循环，并且清除中断标志
                while (!Thread.currentThread().interrupted()) {

                }
                System.out.println("threadOne isInterrupted: " + Thread.currentThread().isInterrupted());
            }
        });

        // 启动线程
        threadOne.start();

        // 设置中断标志
        threadOne.interrupt();

        threadOne.join();
        System.out.println("main thread is over");
    }
}
