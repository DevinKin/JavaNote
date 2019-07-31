package chapter1.sleep;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-30 18:33
 * @description: 睡眠测试interrupt类
 **/
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        // 创建线程
        Thread thread = new Thread(new Runnable() {
            public void run() {
                try {
                    System.out.println("child thread is in sleep");

                    Thread.sleep(10000);
                    System.out.println("child thread is in awaked");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // 启动线程
        thread.start();

        // 主线程休眠两秒
        Thread.sleep(2000);

        // 主线程中断子线程
        thread.interrupt();
    }
}
