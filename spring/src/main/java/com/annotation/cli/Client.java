package com.annotation.cli;


import com.annotation.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层调用业务层
 */
public class Client {


    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationAnno.xml");
        AccountServiceImpl accountServiceImpl = ac.getBean("AccountServiceImpl",AccountServiceImpl.class);
        accountServiceImpl.saveAccount();
    }
}
