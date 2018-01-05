package com.example.demo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ValidForm {
    @NotNull(message = "姓名不可为空")
    @Size(min = 2, max = 20, message = "姓名长度必须在2和20之间")
    private String name;

    @Min(value = 0, message = "年龄设置不能小于0")
    @Max(value = 150, message = "年龄设置不能大于150岁")
    private int age;

    @NotNull(message = "密码不可为空")
    @Size(min = 2, max = 20, message = "姓名长度必须在2和20之间")
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "ValidForm{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                '}';
    }
}
