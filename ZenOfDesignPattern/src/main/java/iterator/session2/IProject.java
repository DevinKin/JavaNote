package iterator.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-08 10:18
 * @description: 项目信息接口
 **/
public interface IProject {
    // 增加项目
    void add(String name, int num, int cost);

    // 从老板这里看到的就是项目信息
    String getProjectInfo();

    // 获得一个可以被遍历的对象
    IProjectIterator iterator();
}
