package chapter3.minorgc;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-13 18:27
 * @description: 新生代MinorGC测试代码
 * VM Args: -verbosegc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:UseSerialGC
 **/
public class MinorGCTest {
    private static final int _1MB = 1024 * 1024;

    public static void testAllocation() {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2 * _1MB];
        allocation2 = new byte[2 * _1MB];
        allocation3 = new byte[2 * _1MB];
        allocation4 = new byte[4 * _1MB];       // 出现一次MinorGC
    }

    public static void main(String[] args) {
        testAllocation();
    }
}
