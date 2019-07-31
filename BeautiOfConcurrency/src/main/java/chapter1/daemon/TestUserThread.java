package chapter1.daemon;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-31 15:13
 * @description: 守护线程2
 **/
public class TestUserThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (;;) {

            }
        });

        // 设置为守护线程
        thread.setDaemon(true);
        // 启动子线程
        thread.start();
        System.out.println("main thread is over");
    }
}
