package com.xd.service.impl;

import com.xd.dao.IAccountDao;
import com.xd.service.IAccountService;

public class AccountServiceImpl implements IAccountService {
    private IAccountDao AccountDao;

    public void setAccountDao(IAccountDao AccountDao) {
        this.AccountDao = AccountDao;
    }

    @Override
    public void saveAccount() {
        AccountDao.saveAccount();
        System.out.println("Service 保存了账户");
    }
}
