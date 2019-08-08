package comb.session3;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 11:17
 * @description: 抽象公司职员类
 **/
public abstract class Corp {
    private String name = "";
    private String position = "";
    private int salary = 0;

    public Corp(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("名称：" + this.name);
        sb.append("\t职位：" + this.position);
        sb.append("\t薪水" + this.salary);
        return sb.toString();
    }
}
