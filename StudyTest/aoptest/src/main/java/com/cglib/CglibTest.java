package com.cglib;

import com.aspect.CglibProxy;
import com.jdk.UserDao;
import com.jdk.impl.UserDaoImpl;

public class CglibTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDaoImpl();
        CglibProxy cglibProxy = new CglibProxy();
        UserDao o = (UserDao) cglibProxy.creatProxy(userDao);
        o.deleteUser();
    }
}
