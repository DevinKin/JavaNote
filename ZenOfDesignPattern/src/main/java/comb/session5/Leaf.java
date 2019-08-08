package comb.session5;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:51
 * @description: 树叶节点
 **/
public class Leaf extends Component{
    @Deprecated
    @Override
    public void add(Component component) {
        // 空实现，直接抛出一个不支持请求的异常。
        throw new UnsupportedOperationException();
    }

    @Deprecated
    @Override
    public void remove(Component component) {
        // 空实现，直接抛出一个不支持请求的异常。
        throw new UnsupportedOperationException();

    }

    @Deprecated
    @Override
    public ArrayList<Component> getChildren() {
        // 空实现，直接抛出一个不支持请求的异常。
        throw new UnsupportedOperationException();
    }
}
