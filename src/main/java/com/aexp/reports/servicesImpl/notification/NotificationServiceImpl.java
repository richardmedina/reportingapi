package com.aexp.reports.servicesImpl.notification;

import com.aexp.reports.api.models.notifications.NotificationModel;
import com.aexp.reports.contract.dto.ServiceResponse;
import com.aexp.reports.contract.dto.notification.NotificationDto;
import com.aexp.reports.services.notification.NotificationService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class NotificationServiceImpl implements NotificationService {
    @Override
    public ServiceResponse<List<NotificationDto>> getFromUser(String userId) {
        List<NotificationDto> notifications = new ArrayList<>();

        for(int i =0; i < 10; i ++){
            var guid = UUID.randomUUID();
            var notification = new NotificationDto(
                    guid.toString(),
                    userId,
                    "Notification title " + (i + 1),
                    "Notification content " + (i + 1),
                    0
            );

            notifications.add(notification);
        }
        return new ServiceResponse(notifications);
    }
}
