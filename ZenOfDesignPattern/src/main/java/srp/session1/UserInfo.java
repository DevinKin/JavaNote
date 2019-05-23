package srp.session1;

public class UserInfo implements IUserInfo{
    private String userId;
    private String userName;
    private String password;

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserId() {
        return "用户id";
    }

    public String getPassword() {
        return "用户密码";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return "用户名";
    }

    public boolean changePassword(String newPassword) {
        return false;
    }

    public boolean deleteUser(IUserBO userBO) {
        return false;
    }

    public void mapUser(IUserBO userBO) {

    }

    public boolean addOrg(IUserBO userBO, int orgID) {
        return false;
    }

    public boolean addRole(IUserBO userBO, int roleID) {
        return false;
    }
}
