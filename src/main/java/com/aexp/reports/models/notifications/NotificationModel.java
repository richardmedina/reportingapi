package com.aexp.reports.models.notifications;

public class NotificationModel {
    private String id;
    private String title;
    private String content;

    // 0: new, 1: read, 2: deleted
    private int state;


    public NotificationModel() { this("", "", "", 0); }

    public NotificationModel(String id, String title, String content, int state){
        this.id = id;
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
