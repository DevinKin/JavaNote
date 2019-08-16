package chapter6.aqs;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-09 11:19
 * @description: AQS条件变量测试类
 **/
public class AqsConditionTest {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        // 创建了一个ConditionObject变量，这个变量是Lock锁对应的一个条件变量
        Condition condition = lock.newCondition();

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(1000);
                System.out.println("child sleep done!");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            try {
                System.out.println("begin signal");
                condition.signal();
                System.out.println("end signal");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        thread.start();

        // 获取独占锁
        lock.lock();
        try {
            System.out.println("begin wait");
            // 调用条件变量的await()方法阻塞挂起了当前线程。
            // 当其他线程调用了条件变量signal方法时，被阻塞的线程才会从awaait处返回
            condition.await();
            System.out.println("end wait");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("main thread unlock!");
            // 释放了获取的锁
            lock.unlock();
        }
    }
}
