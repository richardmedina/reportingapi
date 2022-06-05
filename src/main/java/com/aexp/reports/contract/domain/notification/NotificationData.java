package com.aexp.reports.contract.domain.notification;

public class NotificationData {
    private String id;
    private String userId;
    private String title;
    private String content;

    // 0: new, 1: read, 2: deleted
    private int state;


    public NotificationData() { this("","", "", "", 0); }

    public NotificationData(String id, String userId, String title, String content, int state){
        this.id = id;
        this.userId = userId;
        this.title = title;
        this.content = content;
        this.state = state;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() { return userId; }

    public void setUserId(String userId) { this.userId = userId; }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
