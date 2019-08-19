package facade.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 11:33
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        ILetterProcess letterProcess = new LetterProcessImpl();
        letterProcess.writeContext("Hello, It's me, do you know who I am? I'm");
        letterProcess.fillEnvelope("Happy Road No. 666, God Province, Heaven");
        letterProcess.letterInotoEnvelope();
        letterProcess.sendLetter();
    }
}
