package chapter2.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-08 18:01
 * @description: 堆OOM测试
 * VM Args: -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 **/
public class HeapOOM {
    static class OOMObject {

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
