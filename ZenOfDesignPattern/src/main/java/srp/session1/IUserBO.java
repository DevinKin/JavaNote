package srp.session1;

public interface IUserBO {
    void setUserId(String userId);
    String getUserId();

    String getPassword();
    void setPassword(String password);

    void setUserName(String userName);
    String getUserName();
}
