package com.roohom.demo.homework.day10.Avengers;

/**
 * ClassName: Avengers
 * Author: Roohom
 * Function:
 * Date: 2020/7/25 19:31
 * Software: IntelliJ IDEA
 */
public class Avengers {
    private int id;
    private String name;
    private String sex;

    public Avengers() {
    }

    public Avengers(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}'+"\n";
    }
}
