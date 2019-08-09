package chapter2.oom;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-09 09:44
 * @description: 创建线程导致内存溢出异常
 * VM Args: -Xss2M(不妨设置大一些)
 **/
public class JavaVMStackOOM {
    private void dontStop() {
        while (true) {

        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(() -> {
                dontStop();
            });
            thread.start();
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }
}
