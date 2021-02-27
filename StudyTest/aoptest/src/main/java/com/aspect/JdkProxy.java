package com.aspect;

import com.jdk.UserDao;
import com.jdk.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
    private UserDao userDao;
    public Object createProxy(UserDao userDao) {
        this.userDao = userDao;
        //1.类加载器
        ClassLoader classLoader = JdkProxy.class.getClassLoader();
        // 被代理对象实现的所有接口
        Class[] clazz = userDao.getClass().getInterfaces();
        // 3. 使用代理类，进行增强 返回的是代理后的对象
        return Proxy.newProxyInstance(classLoader, clazz , this);
    }



    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();

        myAspect.check();

        Object obj = method.invoke(userDao,args);

        myAspect.log();
        return obj;
    }
}
