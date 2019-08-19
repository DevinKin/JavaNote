package facade.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 11:30
 * @description: 写信过程
 **/
public interface ILetterProcess {
    void writeContext(String context);
    void fillEnvelope(String address);
    void letterInotoEnvelope();
    void sendLetter();
}
