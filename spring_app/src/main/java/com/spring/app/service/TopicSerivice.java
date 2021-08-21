package com.spring.app.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.app.model.Topic;

@Service
public class TopicSerivice {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic(1L, "Topic 1", "Topic 1 Description"),
			new Topic(2L, "Topic 2", "Topic 2 Description"),
			new Topic(3L, "Topic 3", "Topic 3 Description")));

	public List<Topic>getAllTopics() {
		return topics;
	}
	
	public Topic getTopicById(Long topicId) {		
		return topics.stream().filter((topic)-> topic.getId() == topicId).findFirst().get();
	}
	
	public Topic addTopic(Topic topic) {
		topics.add(topic);
		return topic;
	}
}
