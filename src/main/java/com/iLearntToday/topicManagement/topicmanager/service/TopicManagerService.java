package com.iLearntToday.topicManagement.topicmanager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
@Service
public class TopicManagerService {


    @Autowired
    RestTemplate restTemplate;


   public String test(){

       return restTemplate.getForObject("http://article-manager-service/api/v1/test",String.class);
    }

}
