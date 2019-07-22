package prototype.session4;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 17:02
 * @description: 可拷贝对象
 **/
public class Thing implements Cloneable{
    public Thing() {
        System.out.println("构造函数被执行了...");
    }

    @Override
    protected Thing clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
