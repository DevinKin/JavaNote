package adapter.session1;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 16:37
 * @description: 劳动服务公司的人员实现
 **/
public class OuterUser implements IOuterUser{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话是...");
        return baseInfoMap;
    }

    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("jobPosition", "这个人的职位是BOSS...");
        officeInfoMap.put("officeTelNumber", "员工的办公电话是...");
        return officeInfoMap;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelNumber", "员工的家庭电话是...");
        homeInfoMap.put("homeAddress", "员工的家庭地址是...");
        return homeInfoMap;
    }
}
