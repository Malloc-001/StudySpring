package com.xml.service.impl;

import com.xml.dao.IAccountDao;
import com.xml.service.IAccountService;

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
