package com.iLearntToday.topicManagement.topicmanager.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    String id;
    private String parent_Id;
    private long timestamp;
    private String title;
    private String shortDescription;
    private String fullDescription;
    private String userId;
    private int numberOfLikes;
    List<String> topicsTags;


}
