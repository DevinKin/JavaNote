package lsp.session3;

import java.util.HashMap;

public class Client2 {
    public static void invoker() {
        // 有父类的地方就有子类
        Father2 f = new Father2();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void invokerSon() {
        // 有父类的地方就有子类
        Son2 f = new Son2();
        HashMap map = new HashMap();
        f.doSomething(map);
    }

    public static void main(String[] args) {
        // invoker();
        invokerSon();
    }
}