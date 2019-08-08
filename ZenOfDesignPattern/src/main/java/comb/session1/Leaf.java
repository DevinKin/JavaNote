package comb.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:02
 * @description: 叶子节点实现类
 **/
public class Leaf implements ILeaf{
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Leaf(String name, String position, int salary) {
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
}
