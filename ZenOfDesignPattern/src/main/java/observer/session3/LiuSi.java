package observer.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:48
 * @description: 刘思
 **/
public class LiuSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("刘斯：现在观察到韩非子活动，开始动作了...");
        this.happy(context);
        System.out.println("刘思：乐死了\n");
    }

    private void happy(String context) {
        System.out.println("刘思：因为" + context + "，---所以我快乐啊！");
    }
}
