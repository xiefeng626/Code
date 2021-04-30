package com.example;

import entity.User;

import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        User user = new User("12","23",12,new Date());
        System.out.println(user);
    }
}
