package com.aexp.reports.common.services.useraccount;

import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.useraccount.UserAccountDto;

public interface UserAccountService {
    ServiceResponse<UserAccountDto> getAll();
}
