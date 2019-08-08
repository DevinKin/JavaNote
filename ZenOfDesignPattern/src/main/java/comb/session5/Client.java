package comb.session5;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:32
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Component root) {
        for (Component c : root.getChildren()) {
            if (c instanceof  Leaf) {
                c.doSomething();
            } else {
                display(c);
            }
        }
    }
}
