package chapter2.oom;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-09 10:50
 * @description: 直接内存溢出，使用unsafe分配本机内存
 * VM Args：-Xms20M -XX:MaxDirectMemorySize=10M
 **/
public class DirectMemoryOOM {
    private static final int _1MB = 1024 * 1024;

    public static void main(String[] args) throws IllegalAccessException {
        Field unsafeField = Unsafe.class.getDeclaredFields()[0];
        unsafeField.setAccessible(true);
        Unsafe unsafe = (Unsafe) unsafeField.get(null);
        while (true) {
            unsafe.allocateMemory(_1MB);
        }
    }
}
