package com.aexp.reports.domain.repository;

import com.aexp.reports.common.domain.repository.UserAccountRepository;
import com.aexp.reports.contract.domain.useraccount.UserAccountData;
import com.aexp.reports.domain.repository.entities.UserAccountEntity;
import com.aexp.reports.domain.repository.repos.JpaUserAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserAccountRepositoryImpl implements UserAccountRepository {

    @Autowired
    private JpaUserAccountRepository repo;


    @Override
    public List<UserAccountData> getAll() {

        ArrayList<UserAccountData> accountDataList = new ArrayList<>();
        var repoEntities = repo.findAll();

        for(UserAccountEntity entity : repoEntities){
            UserAccountData userAccount = new UserAccountData(
                    entity.getId(),
                    entity.getUserName(),
                    entity.getPassword(),
                    entity.getFirstName(),
                    entity.getLastName()
            );

            accountDataList.add(userAccount);
        }

        return accountDataList;
    }
}