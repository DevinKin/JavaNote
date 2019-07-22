package prototype.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 16:25
 * @description: 原型模式通用类
 **/
public class PrototypeClass implements Cloneable {
    @Override
    protected PrototypeClass clone() {
        PrototypeClass prototypeClass = null;
        try {
            prototypeClass = (PrototypeClass) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototypeClass;
    }
}
