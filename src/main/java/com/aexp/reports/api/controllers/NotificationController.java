package com.aexp.reports.api.controllers;

import com.aexp.reports.api.models.notifications.NotificationModel;
import com.aexp.reports.beans.mapper.Mapper;
import com.aexp.reports.contract.dto.StatusCode;
import com.aexp.reports.services.notification.NotificationService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("api/notifications")
public class NotificationController extends BaseController {
    private final Mapper mapper;
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService, Mapper mapper) {
        this.mapper = mapper;
        this.notificationService = notificationService;
    }

    @GetMapping
    public ResponseEntity<List<NotificationModel>> get () {

        var response = notificationService.getFromUser("richard1");
        var notifications = response.getResult();

        if (response.getStatusCode() == StatusCode.ERROR) {
            return ResponseEntity.status(500).build();
        }

        var result = mapper.<NotificationModel>mapToList(response.getResult());


        return ResponseEntity.status(200).body(result);
    }
}
