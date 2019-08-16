package chapter6.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-08 12:33
 * @description: unpark测试类3
 **/
public class UnParkTest3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("child begin park!");

            // 调用park方法，挂起自己，只有被中断才会退出循环
            while (!Thread.currentThread().isInterrupted()) {
                LockSupport.park();
            }

            System.out.println("child thread unpark!");
        });

        thread.start();

        Thread.sleep(1000);

        System.out.println("main thread begin unpark!");

        thread.interrupt();
    }
}
