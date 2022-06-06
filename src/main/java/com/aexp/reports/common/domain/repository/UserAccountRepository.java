package com.aexp.reports.common.domain.repository;

import com.aexp.reports.contract.domain.useraccount.UserAccountData;

import java.util.List;

public interface UserAccountRepository {

    List<UserAccountData> getAll();

    /**
    UserAccountData getById(String userName);

    void Delete(String userName);
    void Update(String userName, UserAccountData userAccount);

     **/
}
