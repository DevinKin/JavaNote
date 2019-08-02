package chapter3.threadlocalrandom;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-02 15:45
 * @description:
 **/
public class RandomTest {
    public static void main(String[] args) {
        ThreadLocalRandom random = ThreadLocalRandom.current();

        for (int i= 0; i < 10; i++) {
            System.out.println(random.nextInt(5));
        }
    }
}
