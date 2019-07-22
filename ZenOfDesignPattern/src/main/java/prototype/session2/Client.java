package prototype.session2;

import java.util.Random;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-07-19 16:17
 * @description: 场景类
 **/
public class Client {
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            // 以下是每封邮件不同的地方
            cloneMail.setAppellation(getRandString(5) + " 先生(女士)");
            cloneMail.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            // 发送邮件
            sendMail(mail);
            i++;
        }
    }

    // 发送邮件
    public static void sendMail(Mail mail) {
        System.out.println("标题：" + mail.getSubject() + "\t收件人："
                + mail.getReceiver() + "\t...发送成功！");
    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
