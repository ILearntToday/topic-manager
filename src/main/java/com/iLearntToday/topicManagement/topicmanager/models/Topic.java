package com.iLearntToday.topicManagement.topicmanager.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.sql.Timestamp;

@Data
@Entity
@Table(name="topics")
public class Topic {
    @Id
    String topicName;
    String topicDescription;
    Timestamp creationDate;

    public Topic() {
    }

    public Topic(String topicName, String topicDescription, Timestamp creationDate) {

        this.topicName = topicName;
        this.topicDescription = topicDescription;
        this.creationDate = creationDate;
    }


    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicDescription() {
        return topicDescription;
    }

    public void setTopicDescription(String topicDescription) {
        this.topicDescription = topicDescription;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
}
