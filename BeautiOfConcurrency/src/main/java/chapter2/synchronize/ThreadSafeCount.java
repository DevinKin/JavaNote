package chapter2.synchronize;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-01 16:28
 * @description: 线程安全计算器
 **/
public class ThreadSafeCount {
    private Long value;

    public synchronized Long getCount() {
        return value;
    }

    public synchronized void inc() {
        ++value;
    }
}
