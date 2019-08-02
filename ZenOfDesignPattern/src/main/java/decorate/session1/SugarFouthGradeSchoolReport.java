package decorate.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:39
 * @description: 美化方法
 **/
public class SugarFouthGradeSchoolReport extends FouthGradeShcoolReport{
    private void reportHightScore() {
        System.out.println("这次考试语文最高75，数学是78，自然是80");
    }

    private void reportSort() {
        System.out.println("我是排名第38名...");
    }

    @Override
    public void report() {
        this.reportHightScore();
        super.report();
        this.reportSort();
    }
}
