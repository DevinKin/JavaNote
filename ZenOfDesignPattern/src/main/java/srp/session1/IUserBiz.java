package srp.session1;

public interface IUserBiz {
    boolean changePassword(String newPassword);
    boolean deleteUser(IUserBO userBO);
    void mapUser(IUserBO userBO);
    boolean addOrg(IUserBO userBO, int orgID);
    boolean addRole(IUserBO userBO, int roleID);
}
