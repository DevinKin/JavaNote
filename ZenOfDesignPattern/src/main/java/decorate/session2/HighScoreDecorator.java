package decorate.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-02 14:46
 * @description: 高程继修饰
 **/
public class HighScoreDecorator extends Decorator{
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }

    private void reportHighScore() {
        System.out.println("这次考试语文最高75，数学是78，自然是80");
}

    @Override
    public void report() {
        this.reportHighScore();
        super.report();
    }
}
