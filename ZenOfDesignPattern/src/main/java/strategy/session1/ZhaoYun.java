package strategy.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-06 17:53
 * @description: 使用计谋
 **/
public class ZhaoYun {
    // 赵云出场了，他根据诸葛亮给他的交代，依次拆开妙计
    public static void main(String[] args) {
        Context context;
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("---刘备乐不思蜀了，拆第二个---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
        System.out.println("---孙权的小兵追来了，拆开第三个---");
        context = new Context(new BlockEnemy());
        context.operate();
        System.out.println("\n\n\n\n\n\n\n\n");
    }
}
