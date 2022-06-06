package com.aexp.reports.services.useraccount;

import com.aexp.reports.common.domain.repository.UserAccountRepository;
import com.aexp.reports.common.services.useraccount.UserAccountService;
import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.useraccount.UserAccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public ServiceResponse<UserAccountDto> getAll() {

        var result = userAccountRepository.getAll();

        return null;
    }
}
