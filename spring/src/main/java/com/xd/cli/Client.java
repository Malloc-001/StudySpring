package com.xd.cli;

import com.xd.dao.impl.AccountDaoImpl;
import com.xd.service.IAccountService;
import com.xd.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层调用业务层
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(ac.getBean("AccountService", AccountServiceImpl.class));
        System.out.println(ac.getBean("AccountService", AccountServiceImpl.class));

    }
}
