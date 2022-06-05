package com.aexp.reports.api.controllers;

import com.aexp.reports.beans.mapper.Mapper;
import com.aexp.reports.contract.dto.StatusCode;
import com.aexp.reports.common.services.notification.NotificationService;
import com.aexp.reports.contract.model.notification.NotificationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
