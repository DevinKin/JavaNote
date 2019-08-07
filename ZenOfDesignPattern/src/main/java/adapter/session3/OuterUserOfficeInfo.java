package adapter.session3;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 18:12
 * @description: 用户工作信息
 **/
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfoMap = new HashMap();
        officeInfoMap.put("jobPosition", "这个人的职位是BOSS...");
        officeInfoMap.put("officeTelNumber", "员工的办公电话是...");
        return officeInfoMap;
    }
}
