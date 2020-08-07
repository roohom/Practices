package com.roohom.demo.homework.day18;

import java.util.Date;

/**
 * ClassName: UserEntity
 * Author: Roohom
 * Function:
 * Date: 2020/8/7 18:23
 * Software: IntelliJ IDEA
 */
public class UserEntity {
    private int id;
    private String name;
    private String passwd;
    private int age;
    private String gender;
    private Date date;

    public UserEntity() {
    }

    public UserEntity(int id, String name, String passwd, int age, String gender, Date date) {
        this.name = name;
        this.passwd = passwd;
        this.age = age;
        this.gender = gender;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", date=" + date +
                '}';
    }
}
