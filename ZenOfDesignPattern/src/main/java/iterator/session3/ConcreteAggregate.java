package iterator.session3;

import java.util.Vector;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:45
 * @description: 具体容器类
 **/
public class ConcreteAggregate implements Aggregate{
    private Vector vector = new Vector();
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.vector.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
