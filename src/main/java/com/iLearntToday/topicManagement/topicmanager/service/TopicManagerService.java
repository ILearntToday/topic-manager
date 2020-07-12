package com.iLearntToday.topicManagement.topicmanager.service;

import com.iLearntToday.topicManagement.topicmanager.exception.ImproperTopicException;
import com.iLearntToday.topicManagement.topicmanager.models.Topic;
import com.iLearntToday.topicManagement.topicmanager.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.sql.Timestamp;
import java.util.List;

@Service
public class TopicManagerService {

    @Autowired
    TopicRepository topicRepository;

    @Autowired
    RestTemplate restTemplate;

    public boolean saveTopic(Topic topic) throws ImproperTopicException {
        try {
            if (topic.getTopicName() == null) {
                throw new ImproperTopicException("Topic name not found ", HttpStatus.BAD_REQUEST);
            }
            if (topic.getCreationDate() == null) {
                topic.setCreationDate(new Timestamp(System.currentTimeMillis()));
            }
            topicRepository.save(topic);
        } catch (Exception e) {
            System.out.println("Could not save topic " + e);
            return false;
        }
        return true;
    }

    public String test() {
        return restTemplate.getForObject("http://topic-manager-service/api/v1/test", String.class);
    }

    public boolean saveAllTopic(List<Topic> topics) {
        boolean isAllTopicsSaved = true;
        topicRepository.saveAll(topics);
        return isAllTopicsSaved;
    }
}
