package iterator.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:11
 * @description: 老板类
 **/
public class Boss {
    public static void main(String[] args) {
        // 定义一个List，存放所有的项目对象
        IProject project = new ProjectInfo();
        project.add("星球大战项目", 10, 100000);
        project.add("扭转时空项目", 100, 1000000);
        project.add("超人改造项目", 1000, 10000000);

        // 这边100个项目
        for (int i = 4; i < 104; i++) {
            project.add("第" + i + "个项目", i*5, i*100);
        }

        IProjectIterator projectIterator = project.iterator();
        while (projectIterator.hasNext()) {
            IProject project1 = (IProject) projectIterator.next();
            System.out.println(project1.getProjectInfo());
        }
    }
}
