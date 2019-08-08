package comb.session5;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:28
 * @description: 树枝构件
 **/
public class Composite extends Component{
    // 构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();

    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    // 删除一个叶子构件或树枝构件
    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    // 获得分支下所有叶子构件和树枝构件
    @Override
    public ArrayList<Component> getChildren() {
        return this.componentArrayList;
    }
}
