package com.iLearntToday.topicManagement.topicmanager.models;

import lombok.Data;

@Data
public class ResponseVO<T> {

    int responseCode;
    T body;

    public ResponseVO() {
    }

    public ResponseVO( T body,int responseCode) {
        this.responseCode = responseCode;
        this.body = body;
    }
}
