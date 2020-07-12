package com.iLearntToday.topicManagement.topicmanager.exception;

import org.springframework.http.HttpStatus;

public class ImproperTopicException extends RuntimeException {
    public ImproperTopicException(String topic_name_not_found_, HttpStatus badRequest) {
    }
}
