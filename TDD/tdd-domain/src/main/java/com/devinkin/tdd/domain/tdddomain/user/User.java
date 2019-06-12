package com.devinkin.tdd.domain.tdddomain.user;


import javax.persistence.*;

/**
 * @program: TDD
 * @author: devinkin
 * @create: 2019-06-10 12:20
 * @description: 用户类
 **/
@Table(name = "user", schema = "TDD")
@Entity
public class User {
    @GeneratedValue
    @Id
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_nick_name")
    private String userNickName;

    @Column(name = "gender")
    private String gender;

    @Column(name = "occupation")
    private String occupation;

    @Column(name = "age")
    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public User() {
    }
}
