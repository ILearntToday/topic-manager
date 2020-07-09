package com.iLearntToday.topicManagement.topicmanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iLearntToday.topicManagement.topicmanager.models.Topic;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository  extends JpaRepository <Topic, String>{

}
