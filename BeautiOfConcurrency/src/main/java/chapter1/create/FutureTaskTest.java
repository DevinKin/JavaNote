package chapter1.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-07-23 15:51
 * @description: 使用FutureTask的方式
 **/
public class FutureTaskTest {
    // 创建任务类，类似Runnable
    public static class CallerTask implements Callable<String> {
        public String call() throws Exception {
            System.out.println("线程在执行啊");
            return "hello";
        }
    }

    public static void main(String[] args) {
        // 创建异步任务
        FutureTask<String> futureTask = new FutureTask<String>(new CallerTask());

        // 启动线程
        new Thread(futureTask).start();

        try {
            // 等待任务执行完毕，并返回结果
            String result = futureTask.get();
            System.out.println(result);
        } catch (ExecutionException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
