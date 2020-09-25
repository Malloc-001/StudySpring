package com.ProxyFactoryBean;

import com.ProxyFactoryBean.dao.impl.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationSpringXmlProxy.xml");
        UserDao userDao = (UserDao) ac.getBean("userDaoProxy");
        userDao.addUser();
        userDao.deleteUser();
    }
}