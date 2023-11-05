package com.hit.dto;

/**
 * 数据传输对象
 * log date in transfer（for reference only）
 *
 */
public class SysLogDto {
    String type;
    String subject;
    String action;
    String object;

    public SysLogDto() {
    }

    public SysLogDto(String type, String subject, String action, String object) {
        this.type = type;
        this.subject = subject;
        this.action = action;
        this.object = object;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
}
