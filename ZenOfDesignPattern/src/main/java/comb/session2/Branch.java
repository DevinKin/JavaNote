package comb.session2;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:00
 * @description: 分支的节点实现
 **/
public class Branch implements IBranch{
    private ArrayList<ICorp> subordinateList = new ArrayList();
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Branch(String name, String position, int salary) {
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
    public void addSubordinate(ICorp corp) {
        this.subordinateList.add(corp);
    }

    @Override
    public ArrayList<ICorp> getSubordinate() {
        return this.subordinateList;
    }
}
