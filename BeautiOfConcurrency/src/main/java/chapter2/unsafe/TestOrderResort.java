package chapter2.unsafe;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-01 18:05
 * @description: 指令重排测试类
 **/
public class TestOrderResort {
    private static int num = 0;
    private static boolean ready = false;

    public static class ReadThread extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                if (ready) {
                    System.out.println(num + num);
                }
                System.out.println("read thread...");
            }
        }
    }

    public static class Writethread extends Thread {
        @Override
        public void run() {
            num = 2;
            ready = true;
            System.out.println("writeThread set over...");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReadThread rt = new ReadThread();
        rt.start();

        Writethread wt = new Writethread();
        wt.start();

        Thread.sleep(10);
        rt.interrupt();
        System.out.println("main exit");
    }
}
