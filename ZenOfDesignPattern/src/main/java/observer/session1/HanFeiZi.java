package observer.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-09 16:39
 * @description: 具体的被观察者
 **/
public class HanFeiZi implements IHanFeiZi {
    private boolean isHavingBreakfast = false;
    private boolean isHavingFun = false;

    @Override
    public void haveBreakfast() {
        System.out.println("韩非子：开始吃饭了...");
        this.isHavingBreakfast=true;
    }

    @Override
    public void haveFun() {
        System.out.println("韩非子：开始娱乐了...");
        this.isHavingFun = true;
    }

    public boolean isHavingBreakfast() {
        return isHavingBreakfast;
    }

    public void setHavingBreakfast(boolean isHavingBreakfast) {
        this.isHavingBreakfast = isHavingBreakfast;
    }

    public boolean isHavingFun() {
        return isHavingFun;
    }

    public void setHavingFun(boolean isHavingFun) {
        this.isHavingFun = isHavingFun;
    }
}
