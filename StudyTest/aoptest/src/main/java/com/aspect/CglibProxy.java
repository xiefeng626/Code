package com.aspect;


import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//Methodlnterceptor
public class CglibProxy implements MethodInterceptor {


    public Object creatProxy(Object target){
        //创建 个动态类对象
        Enhancer enhancer = new Enhancer();
        // 确定需要增强的类，设置其父类
        enhancer.setSuperclass(target.getClass());
        //添加回调函数
        enhancer.setCallback(this);

        return enhancer.create();
    }



    /**
     * proxy CGlib 根据指定父类生成的代理对象
     * @param o
     * @param method 拦截的方法
     * @param objects 拦截方法的参数数组
     * @param methodProxy 方法的代理对象，用于执行父类的方法
     * @return
     * @throws Throwable
     */
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check();
        Object o1 = methodProxy.invokeSuper(o, objects);
        myAspect.log();
        return o1;
    }
}
