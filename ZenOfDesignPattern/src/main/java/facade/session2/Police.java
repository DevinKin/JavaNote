package facade.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 11:54
 * @description: 警察类
 **/
public class Police {
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + " 信件已经经过检查了...");
    }
}
