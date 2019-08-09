package chapter2.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-09 09:54
 * @description: 运行时常量池内存溢出异常
 * VM Args(JDK7): -XX:PermSize=10M -XX:MaxPermSize=10M
 * VM Args(JDK8): -XX:MetaspaceSize=10M -XX:MaxMetaspaceSize=10M
 **/
public class RunTimeConstantPoolOOM {
    public static void main(String[] args) {
        // 使用List保持常量池引用，避免Full GC回收常量池行为
        List<String> list = new ArrayList<>();
        // 10Mb的PermSize在integer范围内足够产生OOM了
        int i = 0;
        while (true) {
            list.add(String.valueOf(i++).intern());
        }
    }
}
