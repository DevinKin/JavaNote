package chapter1.create;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-23 15:43
 * @description: runnable方式
 **/
public class RunnableTask implements Runnable{

    public void run() {
        System.out.println("I am a child thread");
    }

    public static void main(String[] args) {
        RunnableTask task = new RunnableTask();
        new Thread(task).start();
        new Thread(task).start();
    }
}
