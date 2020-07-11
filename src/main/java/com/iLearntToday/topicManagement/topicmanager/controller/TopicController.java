package com.iLearntToday.topicManagement.topicmanager.controller;

import com.iLearntToday.topicManagement.topicmanager.exception.ImproperTopicException;
import com.iLearntToday.topicManagement.topicmanager.models.Topic;
import com.iLearntToday.topicManagement.topicmanager.repository.TopicRepository;
import com.iLearntToday.topicManagement.topicmanager.service.TopicManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/topic")
public class TopicController {

    @Autowired
    TopicManagerService topicManagerService;


    /*
        API TO HANDLE FULL TOPIC DETAILS SAVE OPERATION
    */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResponseEntity<?> saveTopic(@RequestBody Topic topic) {

        if (topicManagerService.saveTopic(topic)) {
            return new ResponseEntity<String>("Topic successfully saved", HttpStatus.OK);
        }
        return new ResponseEntity<>("Could not topic ", HttpStatus.INTERNAL_SERVER_ERROR);

    }

    /*
      API TO SAVE LIST OF TOPICS
     */
    @RequestMapping(value="/save-all",method = RequestMethod.POST)
    public ResponseEntity<?> saveAllTopic(@RequestBody List<Topic> topics){
       if( topicManagerService.saveAllTopic(topics)){
           return new ResponseEntity<String>("Topics successfully saved", HttpStatus.OK);
       }
        return new ResponseEntity<>("Could not topic ", HttpStatus.INTERNAL_SERVER_ERROR);
    }
    @RequestMapping(value="/test",method=RequestMethod.GET)
    public String testApi(){
        return "Topic service is working";
    }

}
