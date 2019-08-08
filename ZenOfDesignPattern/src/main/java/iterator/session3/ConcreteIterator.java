package iterator.session3;

import java.util.Vector;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:40
 * @description: 具体迭代器
 **/
public class ConcreteIterator implements Iterator{
    private Vector vector = new Vector();

    // 定义当前游标
    public int cursor = 0;

    @SuppressWarnings("unchecked")
    public ConcreteIterator(Vector _vector) {
        this.vector = _vector;
    }


    @Override
    public Object next() {
        Object result = null;
        if (this.hasNext()) {
            result = this.vector.get(this.cursor++);
        } else {
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if (this.cursor == this.vector.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
