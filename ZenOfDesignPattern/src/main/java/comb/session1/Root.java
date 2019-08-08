package comb.session1;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:57
 * @description: 根节点实现
 **/
public class Root implements IRoot{
    private ArrayList subordinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Root(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("名称：" + this.name);
        sb.append("\t职位：" + this.position);
        sb.append("\t薪水" + this.salary);
        return sb.toString();
    }

    @Override
    public void add(IBranch branch) {
        this.subordinateList.add(branch);
    }

    @Override
    public void add(ILeaf leaf) {
        this.subordinateList.add(leaf);
    }

    @Override
    public ArrayList getSubordinateInfo() {
        return this.subordinateList;
    }
}
