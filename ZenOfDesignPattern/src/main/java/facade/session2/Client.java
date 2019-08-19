package facade.session2;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-19 11:36
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        ModenPostOffice modenPostOffice = new ModenPostOffice();
        String address = "Hello, It's me, do you know who I am? I'm";
        String context = "Happy Road No. 666, God Province, Heaven";
        modenPostOffice.sendLetter(context, address);
    }
}
