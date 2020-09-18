package com.JDKproxy;

import com.JDKproxy.dao.IUserDao;
import com.JDKproxy.dao.impl.UserDaoImpl;

public class JdkTest {
    public static void main(String[] args) {
//        创建代理对象
        JdkProxy jdkProxy = new JdkProxy();
//        创建目标对象
        IUserDao userDao = new UserDaoImpl();
//        从代理对象中获取增强对象
        IUserDao userDao1 = (IUserDao) jdkProxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
