package chapter3.random;

import java.util.Random;

/**
 * @program: BeautiOfConcurrency
 * @author: devinkin
 * @create: 2019-08-02 15:28
 * @description: random类测试
 **/
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt(5));
        }
    }
}
