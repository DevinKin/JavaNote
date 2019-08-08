package comb.session5;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:48
 * @description: 抽象构件
 **/
public abstract class Component {
    public void doSomething() {
        // 编写业务逻辑
    }

    public abstract void add(Component component);

    public abstract void remove(Component component);

    public abstract ArrayList<Component> getChildren();
}
