package com.roohom.demo.homework.day12.UserLogin;

/**
 * ClassName: User
 * Author: Roohom
 * Function:用户类
 * Date: 2020/7/28 20:25
 * Software: IntelliJ IDEA
 */
public class User {
    private String name;
    private String passwd;
    private String birth;
    private String hobby;

    public User() {
    }

    public User(String name, String id, String birth, String hobby) {
        this.name = name;
        this.passwd = id;
        this.birth = birth;
        this.hobby = hobby;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String id) {
        this.passwd = id;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + passwd + '\'' +
                ", birth='" + birth + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
