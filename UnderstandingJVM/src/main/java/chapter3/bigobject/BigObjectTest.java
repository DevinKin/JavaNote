package chapter3.bigobject;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-14 10:48
 * @description: 大对象直接进入老年代
 * VM Args：-verbose:gc -XX:PretenureSizeThreshold=4M -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:+UseConcMarkSweepGC
 **/
public class BigObjectTest {
    private static final int _1MB = 1024 * 1024;

    public static void testPretenureSizeThreshold() {
        byte[] allocation;
        allocation = new byte[4 * _1MB];        // 直接分配在老年代中
    }

    public static void main(String[] args) {
        testPretenureSizeThreshold();
    }
}
