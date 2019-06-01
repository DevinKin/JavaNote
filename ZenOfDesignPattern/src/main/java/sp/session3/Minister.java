package sp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-01 09:27
 * @description: 臣子类
 **/
public class Minister {
    public static void main(String[] args) {
        // 定义5哥大臣
        int ministerNum = 5;
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance();
            System.out.print("第" + (i + 1) + "个大臣参拜的是：");
            emperor.say();
        }
    }
}
