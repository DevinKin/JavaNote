package strategy.session3.method3;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 10:58
 * @description: 加法类
 **/
public class Add implements Calculator{
    @Override
    public int exec(int a, int b) {
        return a+b;
    }
}
