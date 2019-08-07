package adapter.session3;

import adapter.session1.IUserInfo;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 18:17
 * @description: 场景类
 **/
public class Client {
    public static void main(String[] args) {
        // 外系统的人员信息
        IOuterUserBaseInfo baseInfo = new OuterUserBaseInfo();
        IOuterUserHomeInfo homeInfo = new OuterUserHomeInfo();
        IOuterUserOfficeInfo officeInfo = new OuterUserOfficeInfo();

        // 传递三个对象
        IUserInfo youngGirl = new OuterUserInfo(baseInfo, homeInfo, officeInfo);
        for (int i = 0; i < 101; i++) {
            youngGirl.getMobileNumber();
        }
    }
}
