package chapter6.locksupport;

import java.util.concurrent.locks.LockSupport;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-08 12:42
 * @description: 测试Park的blocker对象
 **/
public class TestParkBlocker {
    public void testPark() {
        LockSupport.park();
    }

    public static void main(String[] args) {
        TestParkBlocker testPark = new TestParkBlocker();
        testPark.testPark();
    }
}
