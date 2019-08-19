package observer.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 17:46
 * @description: 具体的观察者
 **/
public class WangSi implements Observer{
    @Override
    public void update(String context) {
        System.out.println("王斯：观察到韩非子活动，自己也开始活动了...");
        this.cry(context);
        System.out.println("王斯：哭死了...\n");
    }

    private void cry(String context) {
        System.out.println("王斯：因为" + context + "，--所以我悲伤啊");
    }
}
