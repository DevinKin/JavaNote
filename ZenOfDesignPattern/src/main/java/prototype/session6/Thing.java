package prototype.session6;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-22 10:00
 * @description: 深拷贝对象
 **/
public class Thing implements Cloneable{
    // 定义一个私有变量
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Object clone() {
        Thing thing = null;
        try {
            thing = (Thing) super.clone();
            thing.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return thing;
    }
}
