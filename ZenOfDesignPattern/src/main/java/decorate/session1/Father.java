package decorate.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:37
 * @description:
 **/
public class Father {
    public static void main(String[] args) {
        SchoolReport sr = new SugarFouthGradeSchoolReport();
        sr.report();
        sr.sign("老三");
    }
}
