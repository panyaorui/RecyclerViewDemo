package com.dssps.app.recyclerviewdemo;

/**
 * 作者：潘跃瑞
 * 时间：2016/11/18
 * 功能：
 */
public class User extends BaseModel{
    private int type;
    private String name;
    private String age;
    private int color1;
    private int color2;

    public User(int type, String name, String age, int color1, int color2) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.color1 = color1;
        this.color2 = color2;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getColor1() {
        return color1;
    }

    public void setColor1(int color1) {
        this.color1 = color1;
    }

    public int getColor2() {
        return color2;
    }

    public void setColor2(int color2) {
        this.color2 = color2;
    }
}
