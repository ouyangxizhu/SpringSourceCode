package com.ouyangxizhu.bean;

import org.springframework.beans.factory.annotation.Value;

public class PersonValue {
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private int age;
    @Value("${personValue.nickName}")
    private String nickName;

    public PersonValue() {
    }

    public PersonValue(String name, int age, String nickName) {
        this.name = name;
        this.age = age;
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "PersonValue{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}
