package adapter.session3;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 18:09
 * @description: 用户基本信息
 **/
public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("userName", "这个员工叫混世魔王...");
        baseInfoMap.put("mobileNumber", "这个员工的电话是...");
        return baseInfoMap;
    }
}
