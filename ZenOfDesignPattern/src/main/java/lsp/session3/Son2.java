package lsp.session3;

import java.util.Collection;
import java.util.HashMap;

public class Son2 extends Father {
    // 缩小输入参数范围
    public Collection doSomething(HashMap map) {
        System.out.println("子类被执行...");
        return map.values();
    }
}