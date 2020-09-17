package com.annotation.service.impl;

import com.annotation.dao.IAccountDao;
import com.annotation.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AccountServiceImpl")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    private IAccountDao AccountDao;


    @Override
    public void saveAccount() {
        AccountDao.saveAccount();
        System.out.println("Service 保存了账户");
    }
}
