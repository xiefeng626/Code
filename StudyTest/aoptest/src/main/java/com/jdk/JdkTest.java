package com.jdk;

import com.aspect.JdkProxy;
import com.jdk.impl.UserDaoImpl;

import java.io.*;

public class JdkTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        UserDao userDao = new UserDaoImpl();
        JdkProxy jdkProxy = new JdkProxy();
        UserDao proxy = (UserDao)jdkProxy.createProxy(userDao);
        proxy.addUser();
        proxy.deleteUser();
    }
}
