package iterator.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:08
 * @description: 项目信息的实现类
 **/
public class Project implements IProject{
    // 项目名称
    private String name = "";
    // 项目成员数量
    private int num = 0;
    // 项目费用
    private int cost = 0;

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public String getProjectInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("项目名称是：" + this.name);
        sb.append("\t项目人数：" + this.num);
        sb.append("\t项目费用：" + this.cost);
        return sb.toString();
    }
}
