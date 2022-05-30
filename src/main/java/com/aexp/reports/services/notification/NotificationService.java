package com.aexp.reports.services.notification;

import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.notification.NotificationDto;

import java.util.List;

public interface NotificationService {
    ServiceResponse<List<NotificationDto>> getFromUser(String userId);
}
