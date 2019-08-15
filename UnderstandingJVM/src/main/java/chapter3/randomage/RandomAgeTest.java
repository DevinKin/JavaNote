package chapter3.randomage;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-14 16:52
 * @description: 动态对象年龄判断测试类
 * VM Args： -verbose:gc -Xms20M -Xmx20M -Xmn10M -XX:+PrintGCDetails -XX:SurvivorRatio=8 -XX:MaxTenuringThreshold=15 -XX:+UseSerialGC -XX:+PrintTenuringDistribution
 **/
public class RandomAgeTest {
    private static final int _1MB = 1024 * 1024;

    @SuppressWarnings("unused")
    public static void testTenuringThresHold2() {
        byte[] allocation1, allocation2, allocation3, allocation4;
        allocation1 = new byte[_1MB /4];
        // 注释掉allocation2,allocation1不会晋升到老年代，打开注释，allocation1+allocation2占用空间大小512KB，满足同年对象达到Survivor空间的一半规则。
        allocation2 = new byte[_1MB / 4];
        // allocation1+allocation2大于suveror空间一半
        allocation3 = new byte[4 * _1MB];
        allocation4 = new byte[4 * _1MB];
        allocation4 = null;
        allocation4 = new byte[4 * _1MB];
    }

    public static void main(String[] args) {
        testTenuringThresHold2();
    }
}
