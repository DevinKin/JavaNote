package sp.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-05-29 15:21
 * @description: 臣子类
 **/
public class Minister {
    public static void main(String[] args) {
        for (int day = 0; day < 3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
