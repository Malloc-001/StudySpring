package com.proxy.CGLIB;

import com.proxy.CGLIB.aspect.MyAspect;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;


import java.lang.reflect.Method;

public class CGLIBproxy implements MethodInterceptor {
//    代理方法
    public Object createProxy(Object target){
//        创建一个代理对象
        Enhancer enhancer = new Enhancer();
//        增强方法
        enhancer.setSuperclass(target.getClass());
//        添加回调函数
        enhancer.setCallback(this);
//        返回创建的代理类
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        创建切面
        MyAspect myAspect = new MyAspect();
//        增强方法
        myAspect.check();
//        执行方法
        Object o1 = methodProxy.invokeSuper(o, objects);
//        增强方法
        myAspect.log();
        return o1;
    }
}
