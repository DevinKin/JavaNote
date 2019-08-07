package adapter.session1;

import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 16:36
 * @description: 劳务服务公司的人员信息接口
 **/
public interface IOuterUser {
    Map getUserBaseInfo();

    Map getUserOfficeInfo();

    Map getUserHomeInfo();
}
