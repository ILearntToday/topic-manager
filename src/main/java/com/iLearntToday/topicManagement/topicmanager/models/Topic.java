package com.iLearntToday.topicManagement.topicmanager.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name="topics")
public class Topic {
    @Id
    String topicId;
    String topicName;
    String topicDescription;

    public Topic() {
    }

    public Topic(String topicId, String topicName, String topicDescription) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }
}
