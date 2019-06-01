package sp.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-05-29 15:17
 * @description: 皇帝类
 **/
public class Emperor {
    // 初始化一个皇帝
    private static final Emperor emperor = new Emperor();

    private Emperor() {
        // 世俗化和道德约束：目的就是不能产生第二个皇帝
    }

    public static Emperor getInstance() {
        return emperor;
    }

    public void say() {
        System.out.println("我就是皇帝某某某某某....");
    }
}
