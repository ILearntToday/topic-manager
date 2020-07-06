package com.iLearntToday.topicManagement.topicmanager.controller;

import com.iLearntToday.topicManagement.topicmanager.service.TopicManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    TopicManagerService topicManagerService;

    @RequestMapping(value="/test",method = RequestMethod.GET)
    public String testArt(){
        return topicManagerService.test();
    }
    @RequestMapping(value="/", method = RequestMethod.GET)
    public String testApi(){
        return "Server running ";
    }
}
