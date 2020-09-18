package com.proxy.CGLIB;

import com.proxy.CGLIB.dao.UserDao;

public class CGLIBTest {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();

        CGLIBproxy cgliBproxy = new CGLIBproxy();
        UserDao userDao1 = (UserDao) cgliBproxy.createProxy(userDao);
        userDao1.addUser();
        userDao1.deleteUser();
    }
}
