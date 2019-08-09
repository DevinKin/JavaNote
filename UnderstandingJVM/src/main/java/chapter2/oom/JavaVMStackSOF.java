package chapter2.oom;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-09 09:36
 * @description: 虚拟机栈和本地方法栈OOM测试类
 * VM Args: -Xss128k
 **/
public class JavaVMStackSOF {
    private int stackLength = 1;

    public void stackLeak() {
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVMStackSOF oom = new JavaVMStackSOF();
        try {
            oom.stackLeak();
        } catch (Throwable e) {
            System.out.println("stack length: " + oom.stackLength);
            throw e;
        }
    }
}
