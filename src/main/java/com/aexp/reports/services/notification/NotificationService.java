package com.aexp.reports.services.notification;

import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.notification.NotificationDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public interface NotificationService {
    ServiceResponse<List<NotificationDto>> getFromUser(String userId);
}
