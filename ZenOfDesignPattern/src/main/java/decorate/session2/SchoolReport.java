package decorate.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:33
 * @description: 抽象成绩单
 **/
public abstract class SchoolReport {
    // 成绩单主要展示的就是你的程继情况
    public abstract void report();
    // 成绩单要家长签字
    public abstract void sign(String name);
}
