package entity;

import java.util.Date;

public class User {
    private String name;
    private String sex;
    private int age;
    private Date date;

    public User(String name, String sex, int age, Date date) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.date = date;
    }

    public User() {
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", date=" + date +
                '}';
    }
}
