package chapter1.interrupt;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-31 11:00
 * @description: 线程睡眠中断测试类
 **/
public class SleepInterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread threadOne = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("threadOne begin sleep for 2000 seconds");
                    Thread.sleep(2000000);
                    System.out.println("threadOne awaking");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("threadOne-leaving normally");
            }
        });

        // 启动线程
        threadOne.start();

        // 确保子线程进入休眠状态
        Thread.sleep(1000);

        // 打断子线程的休眠，让子线程从sleep函数返回
        threadOne.interrupt();

        // 等待子线程执行完毕
        threadOne.join();

        System.out.println("main thread is over");
    }
}
