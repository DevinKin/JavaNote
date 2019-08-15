package chapter3.refcount;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-13 09:57
 * @description: 引用计数的缺陷
 * VM Args：-XX:+PrintGCDetails
 **/
public class ReferenceCountingGC {
    public Object instance = null;

    private static final int _1MB = 1024 * 1024;

    private byte[] bigSize = new byte[2 * _1MB];

    public static void testGC() {
        ReferenceCountingGC objA = new ReferenceCountingGC();
        ReferenceCountingGC objB = new ReferenceCountingGC();

        objA.instance = objB;
        objB.instance = objA;

        // 假设在这里发生GC，objA和objB是否能被回收
        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }
}
