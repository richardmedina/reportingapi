package com.aexp.reports.services.useraccount;

import com.aexp.reports.beans.mapper.Mapper;
import com.aexp.reports.common.domain.repository.UserAccountRepository;
import com.aexp.reports.common.services.useraccount.UserAccountService;
import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.useraccount.UserAccountDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService {

    @Autowired
    private Mapper mapper;

    @Autowired
    private UserAccountRepository userAccountRepository;

    @Override
    public ServiceResponse<List<UserAccountDto>> getAll() {
        var userAccountDataList = userAccountRepository.getAll();
        var result =  mapper.<UserAccountDto>mapToList(userAccountDataList);

        return new ServiceResponse<>(result);
    }
}
