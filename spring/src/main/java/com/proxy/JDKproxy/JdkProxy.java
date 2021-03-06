package com.proxy.JDKproxy;

import com.proxy.JDKproxy.aspect.MyAspect;
import com.proxy.JDKproxy.dao.IUserDao;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {

//    声明目标类接口
    private IUserDao iUserDao;

//    创建代理对象
    public Object createProxy(IUserDao iUserDao){
        this.iUserDao = iUserDao;
//        1.类加载器
        ClassLoader classLoader = JdkProxy.class.getClassLoader();
//        2.获取被代理对象的所有接口
        Class[] interfaces = iUserDao.getClass().getInterfaces();
//        3.使用代理类进行增强，返回的是增强后的对象
        return Proxy.newProxyInstance(classLoader,interfaces,this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
//        前增强
        myAspect.check();
//        在目标上调用方法，并传入参数
        Object obj = method.invoke(iUserDao, args);
//        后增强
        myAspect.log();
        return obj;
    }
}
