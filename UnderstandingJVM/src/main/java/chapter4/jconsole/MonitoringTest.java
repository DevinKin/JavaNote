package chapter4.jconsole;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-20 10:06
 * @description: 监控测试类
 **/
public class MonitoringTest {
    static class OOMObject {
        public byte[] placeholder = new byte[64 * 1024];
    }

    public static void fillHeap(int num) throws InterruptedException {
        List<OOMObject> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            // 稍作延时，令监控曲线的变化更加明显
            Thread.sleep(50);
            list.add(new OOMObject());
        }
        System.gc();
    }

    public static void main(String[] args) throws InterruptedException {
        fillHeap(1000);
    }
}
