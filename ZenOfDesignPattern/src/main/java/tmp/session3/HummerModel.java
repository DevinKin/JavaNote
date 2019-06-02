package tmp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:44
 * @description: 抽象悍马模型
 **/
public abstract class HummerModel {
    /**
     * 首先，这个模型要能被发动起来，别管是手摇发动，还是电力发动，
     * 反正要是能够发动起来，那这个实现要在实现类里了
     */
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final void run() {
        this.start();
        this.engineBoom();
        if (isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }
}
