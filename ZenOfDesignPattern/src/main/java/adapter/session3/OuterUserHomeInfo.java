package adapter.session3;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 18:11
 * @description: 员工家庭信息
 **/
public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfoMap = new HashMap();
        homeInfoMap.put("homeTelNumber", "员工的家庭电话是...");
        homeInfoMap.put("homeAddress", "员工的家庭地址是...");
        return homeInfoMap;
    }
}
