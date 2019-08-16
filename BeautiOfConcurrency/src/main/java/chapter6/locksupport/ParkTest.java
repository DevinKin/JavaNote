package chapter6.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-08 12:19
 * @description: park方法测试类
 **/
public class ParkTest {
    public static void main(String[] args) {
        System.out.println("begin park!");
        LockSupport.park();
        System.out.println("end park!");
    }
}
