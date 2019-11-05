package chapter7;

/**
 * @program: UnderstandingJVM
 * @author: devinkin
 * @create: 2019-11-04 12:52
 * @description:
 **/
public class DeadLoopClass {
    static class DeadLoopClass2 {
        static {
            if (true) {
                System.out.println(Thread.currentThread() + " init DeadLoopClass2");
                while (true) {

                }
            }
        }
    }

    public static void main(String[] args) {
        Runnable script = new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + " start");
                DeadLoopClass2 dlc = new DeadLoopClass2();
                System.out.println(Thread.currentThread() + " run over");
            }
        };
        Thread thread1 = new Thread(script);
        Thread thread2 = new Thread(script);
        Thread thread3 = new Thread(script);
        thread1.start();
        thread2.start();
    }
}
