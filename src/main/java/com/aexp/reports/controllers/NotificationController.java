package com.aexp.reports.controllers;

import com.aexp.reports.models.notifications.NotificationModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("api/notifications")
public class NotificationController {
    private ArrayList<NotificationModel> notifications;

    public NotificationController(){
        notifications = new ArrayList<>();
        for(int i =0; i < 10; i ++){
            var guid = UUID.randomUUID();
            var notification = new NotificationModel(
                    guid.toString(),
                    "Notification title " + (i + 1),
                    "Notification content " + (i + 1),
                    0
            );

            notifications.add(notification);
        }
    }

    @GetMapping
    public ResponseEntity<ArrayList<NotificationModel>> get () {
        if(notifications == null) {
            return ResponseEntity.status(200).body(new ArrayList());
        }

        return ResponseEntity.status(200).body(notifications);
    }
}
