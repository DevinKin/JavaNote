package chapter6.aqs;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-09 12:45
 * @description: 测试不可重入独占锁
 **/
public class TestNonReentrantLock {
    final static NonReentrantLock lock = new NonReentrantLock();
    final static Condition notFull = lock.newCondition();
    final static Condition notEmpty = lock.newCondition();

    final static Queue<String> queue = new LinkedBlockingQueue<>();
    final static int queueSize = 10;

    public static void main(String[] args) throws InterruptedException {
        Thread producer = new Thread(() -> {
            // 获取独占锁
            lock.lock();
            try {
                // 如果队列满了，则等待
                while (queue.size() == queueSize) {
                    notEmpty.await();
                }

                // 添加元素到队列
                queue.add("ele");
                System.out.println("producer: " + queue);
                // 唤醒消费线程
                notFull.signalAll();

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 释放锁
                lock.unlock();
            }
        });

        Thread consumer = new Thread(() -> {
            // 获取独占锁
            lock.lock();
            try {
                // 队列为空，则等待
                while (0 == queue.size()) {
                    notFull.await();
                }

                // 消费一个元素
                String ele = queue.poll();
                System.out.println("consumer: " + queue);

                // 唤醒生产者线程
                notEmpty.signalAll();
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // 释放锁
                lock.unlock();
            }
        });

        // 启动线程
        producer.start();
        consumer.start();
    }
}
