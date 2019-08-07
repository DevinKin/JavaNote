package adapter.session1;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 16:50
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
//        IUserInfo userInfo = new UserInfo();
        IUserInfo userInfo = new OuterUserInfo();
        for (int i = 0; i < 101; i++) {
            userInfo.getMobileNumber();
        }
    }
}
