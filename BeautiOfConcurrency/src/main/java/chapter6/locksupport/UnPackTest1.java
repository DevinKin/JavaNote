package chapter6.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-08 12:24
 * @description: unpark方法测试类1
 **/
public class UnPackTest1 {
    public static void main(String[] args) {
        System.out.println("begin park!");

        // 使当前线程获取到许可证
        LockSupport.unpark(Thread.currentThread());

        // 再次调用park方法，会返回
        LockSupport.park();

        System.out.println("end park!");
    }
}
