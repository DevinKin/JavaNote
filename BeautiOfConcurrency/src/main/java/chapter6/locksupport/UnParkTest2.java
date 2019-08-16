package chapter6.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-08 12:26
 * @description: unpark测试类2
 **/
public class UnParkTest2 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("child thread begin park!");

            // 调用park方法，挂起自己
            LockSupport.park();

            System.out.println("child thread unpark!");
        });

        // 启动子线程
        thread.start();

        // 主线程休眠1s
        Thread.sleep(1000);

        System.out.println("main thread begin unpark!");

        // 调用unpark方法让thread线程持有许可证，然后park方法返回
        LockSupport.unpark(thread);
    }
}
