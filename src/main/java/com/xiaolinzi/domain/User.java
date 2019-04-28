package com.xiaolinzi.domain;

public class User {
    private String use;
    private Integer age;

    public String getUse() {
        return use;
    }

    public void setUse(String use) {
        this.use = use;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "use='" + use + '\'' +
                ", age=" + age +
                '}';
    }
}
