package iterator.session2;

import java.util.ArrayList;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:19
 * @description: 项目信息类
 **/
public class ProjectInfo implements IProject{
    // 定义一个项目列表，所有的项目信息都放在这里
    private ArrayList<IProject> projectList = new ArrayList<>();

    // 项目名称
    private String name = "";
    // 项目成员数量
    private int num = 0;
    // 项目费用
    private int cost = 0;

    public ProjectInfo() {
    }

    private ProjectInfo(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new ProjectInfo(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append("项目名称是：" + this.name);
        sb.append("\t项目人数：" + this.num);
        sb.append("\t项目费用：" + this.cost);
        return sb.toString();
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
