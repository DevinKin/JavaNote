package tmp.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-06-02 11:46
 * @description: H1型号悍马模型
 **/
public class HummerH2Model extends HummerModel {

    @Override
    protected void start() {
        System.out.println("悍马H2启动...");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎的声音是这样的...");
    }


    // 默认没有喇叭的
    @Override
    protected boolean isAlarm() {
        return false;
    }
}
