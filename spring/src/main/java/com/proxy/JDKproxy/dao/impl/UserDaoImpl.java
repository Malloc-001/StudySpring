package com.proxy.JDKproxy.dao.impl;

import com.proxy.JDKproxy.dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void deleteUser() {
        System.out.println("删除用户");
    }
}
