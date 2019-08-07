package adapter.session3;

import adapter.session1.IUserInfo;

import java.util.Map;

/**
 * @program: zen-of-design-pattern
 * @author: devinkin
 * @create: 2019-08-07 18:13
 * @description: 适配器
 **/
public class OuterUserInfo implements IUserInfo {
    // 源目标对象
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    // 数据处理
    private Map baseInfoMap = null;
    private Map homeInfoMap = null;
    private Map officeInfoMap = null;

    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;

        this.baseInfoMap = this.baseInfo.getUserBaseInfo();
        this.homeInfoMap = this.homeInfo.getUserHomeInfo();
        this.officeInfoMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        String userName = (String) this.baseInfoMap.get("userName");
        System.out.println(userName);
        return userName;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String) this.homeInfoMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getOfficeTelNumber() {
        String officeTelNumber = (String) this.officeInfoMap.get("officeTelNumber");
        System.out.println(officeTelNumber);
        return officeTelNumber;
    }

    @Override
    public String getJobPosition() {
        String jobPosition = (String) this.officeInfoMap.get("jobPosition");
        System.out.println(jobPosition);
        return jobPosition;
    }

    @Override
    public String getHomeTelNumber() {
        String homeTelNumber = (String) this.homeInfoMap.get("homeTelNumber");
        System.out.println(homeTelNumber);
        return homeTelNumber;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String) this.baseInfoMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }
}
