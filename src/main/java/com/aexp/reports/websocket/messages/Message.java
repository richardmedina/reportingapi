package com.aexp.reports.websocket.messages;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {
    public String senderName;
    public String receiverName;
    public String message;
    public String date;
    public MessageStatus status;
}
