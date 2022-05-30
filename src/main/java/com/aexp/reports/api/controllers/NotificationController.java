package com.aexp.reports.api.controllers;

import com.aexp.reports.api.models.notifications.NotificationModel;
import com.aexp.reports.contract.dto.StatusCode;
import com.aexp.reports.contract.dto.notification.NotificationDto;
import com.aexp.reports.services.notification.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/notifications")
public class NotificationController {
    private ArrayList<NotificationModel> notifications;
    private final NotificationService notificationService;

    public NotificationController(@Autowired NotificationService notificationService){
        this.notificationService = notificationService;
    }

    @GetMapping
    public ResponseEntity<List<NotificationDto>> get () {

        var response = notificationService.getFromUser("richard1");
        var notifications = response.getResult();

        if (response.getStatusCode() == StatusCode.SUCCESS) {
            return ResponseEntity.status(500).build();
        }

        return ResponseEntity.status(200).body(notifications);
    }
}
