package com.devinkin.tdd.domain.tdddomain.user;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 10:45
 * @description: 用户dto
 **/
public class UserDto {
    private String userName;
    private String userNickName;
    private String gender;
    private String occupation;
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNickName() {
        return userNickName;
    }

    public void setUserNickName(String userNickName) {
        this.userNickName = userNickName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
