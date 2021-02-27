package com.jdk.impl;

import com.jdk.UserDao;

public class UserDaoImpl implements UserDao {
    public void addUser() {
        System.out.println("add user");
    }

    public void deleteUser() {
        System.out.println("delete user");
    }
}
