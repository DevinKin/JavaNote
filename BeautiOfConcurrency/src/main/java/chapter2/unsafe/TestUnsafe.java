package chapter2.unsafe;


import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-01 17:09
 * @description: Unsafe测试类
 **/
public class TestUnsafe {
    // 获取Unsafe实例
    static final Unsafe unsafe;

    // 记录变量state在类TestUnsafe中的偏移值
    static final long stateOffset;

    // 变量
    private volatile long state=0;

    static {
        try {
            // 使用反射获取Unsafe的成员变量theUnsafe
            Field field = Unsafe.class.getDeclaredField("theUnsafe");

            // 设置为可存取
            field.setAccessible(true);
            // 获取该变量的值
            unsafe = (Unsafe) field.get(null);

            // 获取state变量在TestUnsafe中的偏移值
            stateOffset = unsafe.objectFieldOffset(TestUnsafe.class.getDeclaredField("state"));
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
            throw new Error(ex);
        }
    }

    public static void main(String[] args) {
        // 创建实例
        TestUnsafe test = new TestUnsafe();

        System.out.println(test.state);
        Boolean success = unsafe.compareAndSwapInt(test, stateOffset, 0, 1);
        System.out.println(test.state);
        System.out.println(success);
    }
}
