package com.ProxyFactoryBean.dao.impl;

import com.ProxyFactoryBean.dao.IUserDao;

public class UserDao implements IUserDao {
    @Override
    public void addUser(){
        System.out.println("增加用户");
    }
    @Override
    public void deleteUser(){
        System.out.println("删除用户");
    }
}
