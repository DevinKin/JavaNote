package chapter2.synchronize;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-01 16:26
 * @description: 线程不安全计算器类
 **/
public class ThreadNotSafeCount {
    private Long value;

    public Long getValue() {
        return value;
    }

    public void inc() {
        ++value;
    }
}
