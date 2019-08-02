package decorate.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:34
 * @description: 四年级成绩单
 **/
public class FouthGradeShcoolReport extends SchoolReport{
    @Override
    public void report() {
        System.out.println("尊敬的XXX家长：");
        System.out.println("  ......");
        System.out.println("  语文62   数学65  体育98   自然63");
        System.out.println("                家长签字：");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为：" + name);
    }
}
