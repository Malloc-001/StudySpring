package com.xml.cli;

import com.xml.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层调用业务层
 */
public class Client {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationXml.xml");
        System.out.println(ac.getBean("AccountService", AccountServiceImpl.class));
        System.out.println(ac.getBean("AccountService", AccountServiceImpl.class));

    }
}
