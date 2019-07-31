package chapter1.daemon;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-31 15:06
 * @description: 守护线程
 **/
public class DaemonThread {
    public static void main(String[] args) {
        Thread daemonThread = new Thread(() -> {
        });

        // 设置为守护线程
        daemonThread.setDaemon(true);
        daemonThread.start();
    }
}
