package chapter2.item2;

import java.util.UUID;

/**
 * @program: EffectiveJava
 * @author: devinkin
 * @create: 2019-05-30 11:40
 * @description: test
 **/
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 52; i++) {
            System.out.println(UUID.randomUUID().toString().replace("-", ""));
        }
    }
}
