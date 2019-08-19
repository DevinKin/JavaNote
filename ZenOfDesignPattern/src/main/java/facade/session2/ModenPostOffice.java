package facade.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 11:37
 * @description: 邮政局
 **/
public class ModenPostOffice {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();
    public void sendLetter(String context, String address) {
        letterProcess.writeContext(context);
        letterProcess.fillEnvelope(address);
        police.checkLetter(letterProcess);
        letterProcess.sendLetter();
    }
}
