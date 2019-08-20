package chapter4.jconsole;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-08-20 10:39
 * @description: 死锁演示代码
 **/
public class DeadLockTest {
    static class SynAddRunable implements Runnable {
        int a, b;
        public SynAddRunable(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public void run() {
            synchronized (Integer.valueOf(a)) {
                synchronized (Integer.valueOf(b)) {
                    System.out.println(a + b);
                }
            }
        }

        public static void main(String[] args) {
            for (int i = 0; i < 100 ; i++) {
                new Thread(new SynAddRunable(1, 2)).start();
                new Thread(new SynAddRunable(2, 1)).start();
            }
        }
    }
}
