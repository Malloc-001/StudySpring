package com.annotation.dao.impl;

import com.annotation.dao.IAccountDao;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements IAccountDao {

    @Override
    public void saveAccount() {
        System.out.println("Dao 保存了账户");
    }
}
