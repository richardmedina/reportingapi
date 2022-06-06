package com.aexp.reports.common.services.useraccount;

import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.useraccount.UserAccountDto;

import java.util.List;

public interface UserAccountService {
    ServiceResponse<List<UserAccountDto>> getAll();
}
