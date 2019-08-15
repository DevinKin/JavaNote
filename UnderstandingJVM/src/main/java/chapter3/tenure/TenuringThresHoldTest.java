package chapter3.tenure;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-14 11:05
 * @description: 长期存活的对象将进入老年
 * VM Args： -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=1 -XX:+UseSerialGC -XX:+PrintTenuringDistribution
 **/
public class TenuringThresHoldTest {
    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void testTenuringThreshold() {
        byte[] allocation1, allocation2, allocation3;
        // 256K
        // 什么时候进入老年代取决于XX:MaxTenuringThreshold设置
        allocation1 = new byte[_1MB / 4];
        allocation2 = new byte[4 * _1MB];
        // 第一次gc，新生代内存区
        allocation3 = new byte[4 * _1MB];
        allocation3 = null;
        allocation3 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThreshold();
    }
}
