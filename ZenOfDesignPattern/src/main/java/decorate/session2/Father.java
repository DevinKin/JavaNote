package decorate.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:50
 * @description: 父亲类
 **/
public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new FouthGradeShcoolReport();
        sr = new HighScoreDecorator(sr);
        sr = new SortDecorator(sr);
        sr.report();
        sr.sign("老三");
    }
}
