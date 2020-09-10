package com.xd.dao.impl;

import com.xd.dao.IAccountDao;

public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("Dao 保存了账户");
    }
}
