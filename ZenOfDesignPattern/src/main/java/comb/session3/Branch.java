package comb.session3;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:19
 * @description: 树枝节点
 **/
public class Branch extends Corp{
    ArrayList<Corp> subordinateList = new ArrayList<>();
    public Branch(String name, String position, int salary) {
        super(name, position, salary);
    }

    public void addSubordinate(Corp corp) {
        this.subordinateList.add(corp);
    }

    public ArrayList<Corp> getSubordinate() {
        return subordinateList;
    }
}
